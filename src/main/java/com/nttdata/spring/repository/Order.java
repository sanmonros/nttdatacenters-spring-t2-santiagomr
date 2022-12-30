package com.nttdata.spring.repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Pedidos
 * 
 * @author santiagomr
 *
 */
public class Order {

	/** Identificador pedidos */
	private Long orderId;

	/** Destinatario */
	private String receiver;

	/** Dirección de entrega */
	private String shipAddress;

	/** Comprobar ciudad entrega */
	private boolean isOnPeninsula;

	/** Lista de productos relacionadas con el pedido */
	private List<Products> products;

	/**
	 * Método constructor de pedidos
	 * 
	 * @param orderId
	 * @param receiver
	 * @param shipAddress
	 */
	public Order(Long orderId, String receiver, String shipAddress) {
		super();
		this.orderId = orderId;
		this.receiver = receiver;
		this.shipAddress = shipAddress;
		this.products = new ArrayList<>();
	}

	/**
	 * Devolver el id del pedido
	 * 
	 * @return the orderId
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * Fijar el id del pedido
	 * 
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * Devolver el destinatario del pedido
	 * 
	 * @return the receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * Fijar el destinatario del pedido
	 * 
	 * @param receiver the receiver to set
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * Devolver la dirección de envío
	 * 
	 * @return the shipAddress
	 */
	public String getShipAddress() {
		return shipAddress;
	}

	/**
	 * Fijar la dirección de envío
	 * 
	 * @param shipAddress the shipAddress to set
	 */
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	/**
	 * Devolver la informaciómn determinante para seber si el envío es o no
	 * peninsular
	 * 
	 * @return the isOnSpain
	 */
	public boolean isOnPeninsula() {
		return isOnPeninsula;
	}

	/**
	 * Fijar la información de la dirección de entrega del envío
	 * 
	 * @param isOnSpain the isOnSpain to set
	 */
	public void setOnPeninsula(boolean isOnPeninsula) {
		this.isOnPeninsula = isOnPeninsula;
	}

	/**
	 * Devolver la lista de productos asociados al pedido
	 * 
	 * @return the products
	 */
	public List<Products> getProducts() {
		return products;
	}

	/**
	 * Fijar la lista de productos asociados al pedido
	 * 
	 * @param products the products to set
	 */
	public void setProducts(List<Products> products) {
		this.products = products;
	}

	/**
	 * Método para incluir productos a la lista
	 * 
	 * @param product
	 */
	public void addProduct(Products product) {
		if (!this.products.contains(product)) {
			this.products.add(product);
		}

	}

	/**
	 * Metodo para obtener el valor total del pedido
	 * 
	 * @return
	 */
	public Float getTotalPrice() {
		Float totalPrice = 0.0f;
		for (Products p : this.getProducts()) {
			totalPrice += p.getProductPriceWithTaxes();
		}
		return totalPrice;
	}

	/**
	 * Método para eliminar los productos
	 */
	public void deleteProducts() {
		this.products.clear();
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", receiver=" + receiver + ", shipAddress=" + shipAddress
				+ ", isOnPeninsula=" + isOnPeninsula + ", products=" + products + "]";
	}

}
