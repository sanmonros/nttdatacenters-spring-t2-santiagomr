package com.nttdata.spring.services;

import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Order;
import com.nttdata.spring.repository.Products;

/**
 * Servicio envíos fuera del territorio peninsular
 * 
 * @author santiagomr
 *
 */
@Service("serviceNotPeninsular")
public class OrderManagementNotPeninsularImpl implements OrderManagementServiceI {

	@Override
	public Order generateOrder(Long Id, String receiver, String shipAddress) {
		return new Order(Id, receiver, shipAddress);

	}

	@Override
	public void insertProductsInOrder(Products product, Order order) {
		product.setProductPriceWithTaxes(
				product.getProductPriceWithoutTaxes() * 0.04f + product.getProductPriceWithoutTaxes());
		order.addProduct(product);

	}

	@Override
	public void breakDownOrder(Order order) {
		order.deleteProducts();
		System.out.println("El producto con Id: " + order.getOrderId() + " ha sido eliminado");

	}

	@Override
	public void consultOrder(Order orders) {
		System.out.println("ID : " + orders.getOrderId());
		System.out.println("Destinatario : " + orders.getReceiver());
		System.out.println("Dirección : " + orders.getShipAddress());
		System.out.println("Pedidos : " + orders.getProducts());
		System.out.println("Precio Final: " + orders.getTotalPrice());

	}

}
