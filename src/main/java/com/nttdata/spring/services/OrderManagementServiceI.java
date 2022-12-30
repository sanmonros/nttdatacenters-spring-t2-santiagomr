package com.nttdata.spring.services;

import com.nttdata.spring.repository.Order;
import com.nttdata.spring.repository.Products;

/**
 * Interfaz de Pedidos
 * 
 * @author santiagomr
 *
 */
public interface OrderManagementServiceI {

	/**
	 * Generar un nuevo pedido
	 * 
	 * @param Id
	 * @param receiver
	 * @param shipAddress
	 * @return
	 */
	public Order generateOrder(Long Id, String receiver, String shipAddress);

	/**
	 * Insertar productos en los pedidos realizado por el cliente
	 * 
	 * @param product
	 * @param order
	 */
	public void insertProductsInOrder(Products product, Order order);

	/**
	 * Consultar los datos del pedido
	 * 
	 * @param orders
	 */
	public void consultOrder(Order orders);

	/**
	 * Cancelar el pedido
	 * 
	 * @param orders
	 * @return
	 */
	public void breakDownOrder(Order order);

}
