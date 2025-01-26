package com.jcsoftware.jspdesafio0.services;

import org.springframework.stereotype.Service;

import com.jcsoftware.jspdesafio0.entities.Order;

@Service
public class ShippingService {

	public Double shipment(Order order) {
		
		double value = 0;
	    if(order.getBasic() < 100.0) {
		   value = 20.0;	
		}
	    if(order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
	      value = 12.0;	
	    }
		if(order.getBasic() >= 200.0) {
		   value = 0.0;	
		}
		
		return value;
		
		
	}
}
