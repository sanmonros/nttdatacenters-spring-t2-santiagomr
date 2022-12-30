package com.nttdata.spring.services;

import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Products;

/**
 * Servicio de productos
 * 
 * @author santiagomr
 *
 */

@Service("productService")
public class ProductManagamentServiceImpl implements ProductManagementServiceI {

	@Override
	public Products generateProduct(Long Id, String productName, float productPriceWithoutTaxes) {
		Products genericProducts = new Products();
		genericProducts.setProductId(Id);
		genericProducts.setProductName(productName);
		genericProducts.setProductPriceWithoutTaxes(productPriceWithoutTaxes);
		return genericProducts;
	}

	

}
