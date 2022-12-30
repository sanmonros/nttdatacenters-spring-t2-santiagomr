package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.nttdata.spring.repository.Order;
import com.nttdata.spring.repository.Products;
import com.nttdata.spring.services.OrderManagementServiceI;
import com.nttdata.spring.services.ProductManagementServiceI;

/**
 * Segundo - Taller - Spring
 * 
 * Clase Principal
 * 
 * @author santiagomr
 *
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class NTTDataMainSpringT2 implements CommandLineRunner {

	@Autowired
	private ProductManagementServiceI productService;

	@Autowired
	@Qualifier("servicePeninsular")
	private OrderManagementServiceI orderServicePeninsular;

	@Autowired
	@Qualifier("serviceNotPeninsular")
	private OrderManagementServiceI orderServiceNotPeninsular;

	/**
	 * Método principar que inicializa nuestra aplicación
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMainSpringT2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Generación de productos

		Products pr1 = productService.generateProduct(1L, "Ordenador Portatil", 450.0f);
		Products pr2 = productService.generateProduct(2L, "Teclado", 10.0f);
		Products pr3 = productService.generateProduct(3L, "Ratón", 6.0f);
		Products pr4 = productService.generateProduct(4L, "Ordenador Sobremesa", 650.0f);
		Products pr5 = productService.generateProduct(5L, "Cascos", 18.0f);
		Products pr6 = productService.generateProduct(6L, "Alfombrilla", 5.0f);
		Products pr7 = productService.generateProduct(5L, "Tarjeta Gráfica", 300.0f);
		Products pr8 = productService.generateProduct(6L, "Fuente de Alimentación", 250.0f);

		// Generación de pedidos

		Order or1 = orderServiceNotPeninsular.generateOrder(1L, "Rocío Granado", "C/La Palma");
		Order or2 = orderServiceNotPeninsular.generateOrder(2L, "Álvaro García", "C/La Gomera");
		Order or3 = orderServicePeninsular.generateOrder(3L, "Pedro Romero", "Av Ramón y Cajal");
		Order or4 = orderServicePeninsular.generateOrder(4L, "Alba Serrano", "C/ Emilio Lemos");

		// Inserción de productos en envíos peninsulares y no peninsulares

		orderServiceNotPeninsular.insertProductsInOrder(pr1, or1);
		orderServiceNotPeninsular.insertProductsInOrder(pr2, or1);
		orderServiceNotPeninsular.insertProductsInOrder(pr3, or2);
		orderServiceNotPeninsular.insertProductsInOrder(pr4, or2);
		orderServicePeninsular.insertProductsInOrder(pr5, or3);
		orderServicePeninsular.insertProductsInOrder(pr6, or3);
		orderServicePeninsular.insertProductsInOrder(pr7, or4);
		orderServicePeninsular.insertProductsInOrder(pr8, or4);

		// Borrar un envío
		orderServiceNotPeninsular.breakDownOrder(or1);

		// Consultar los pedidos con su precio total
		orderServiceNotPeninsular.consultOrder(or1);
		orderServiceNotPeninsular.consultOrder(or2);
		orderServicePeninsular.consultOrder(or3);
		orderServicePeninsular.consultOrder(or4);

	}

}
