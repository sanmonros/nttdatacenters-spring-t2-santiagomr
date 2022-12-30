package com.nttdata.spring.repository;

public class Products {

	/** Identificador producto */
	private Long productId;

	/** Nombre del producto */
	private String productName;

	/** Precio del producto con iva */
	private float productPriceWithTaxes;

	/** Precio del producto sin IVA */
	private float productPriceWithoutTaxes;

	/**
	 * Devolver el Id del producto
	 * 
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * Fijar el Id del producto
	 * 
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * Devolver el nombre del producto
	 * 
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Fijar el nombre del producto
	 * 
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Devolver el precio con las taxas(Impuestos)
	 * 
	 * @return the productPriceWithTaxes
	 */
	public float getProductPriceWithTaxes() {
		return productPriceWithTaxes;
	}

	/**
	 * Fijar el precio con las taxas(Impuestos)
	 * 
	 * @param productPriceWithTaxes the productPriceWithTaxes to set
	 */
	public void setProductPriceWithTaxes(float productPriceWithTaxes) {
		this.productPriceWithTaxes = productPriceWithTaxes;
	}

	/**
	 * Devolver el precio del producto del precio sin taxas(Impuestos)
	 * 
	 * @return the productPriceWithoutTaxes
	 */
	public float getProductPriceWithoutTaxes() {
		return productPriceWithoutTaxes;
	}

	/**
	 * Fijar el precio sin taxas(Impuestos)
	 * 
	 * @param productPriceWithoutTaxes the productPriceWithoutTaxes to set
	 */
	public void setProductPriceWithoutTaxes(float productPriceWithoutTaxes) {
		this.productPriceWithoutTaxes = productPriceWithoutTaxes;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productPriceWithTaxes="
				+ productPriceWithTaxes + ", productPriceWithoutTaxes=" + productPriceWithoutTaxes + "]";
	}

}
