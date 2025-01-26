package com.jcsoftware.jspdesafio0;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jcsoftware.jspdesafio0.entities.Order;
import com.jcsoftware.jspdesafio0.services.OrderService;

@SpringBootApplication
public class Jspdesafio0Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Jspdesafio0Application.class, args);
	}
	
	@Autowired
	OrderService orderService;

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		System.out.print("Código do pedido: ");
		Scanner sc = new Scanner(System.in);
		Integer code = sc.nextInt();
		sc.nextLine();
		System.out.print("Valor do pedido: ");
		Double basic = sc.nextDouble();
		System.out.print("Valor do desconto (%): ");
		Double discount = sc.nextDouble();
		Order order = new Order(code,basic,discount);
		System.out.println();
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f%n",orderService.total(order));
		sc.close();
	}

}
