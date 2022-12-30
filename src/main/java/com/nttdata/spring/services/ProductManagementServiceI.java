package com.nttdata.spring.services;

import com.nttdata.spring.repository.Products;

/**
 * Interfaz de productos
 * 
 * @author santiagomr
 *
 */
public interface ProductManagementServiceI {

	/**
	 * Creación de un producto genérico sin aplicación de taxas
	 * 
	 * @param Id
	 * @param productName
	 * @param productPriceWithoutTaxes
	 * @return
	 */
	public Products generateProduct(Long Id,String productName,float productPriceWithoutTaxes);
		
	
}
