package com.sap.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.dto.ProductPriceListDTO;
import com.sap.entity.Products;
import com.sap.repository.ProductsRepo;

@Service
public class GetProductsService {

	private static final Logger logger = LoggerFactory.getLogger(GetProductsService.class);

	@Autowired
	ProductsRepo productsRepo;

	public List<Products> getProductsE() {
		logger.info("getProductsE() service method is called.");

		List<Products> products = productsRepo.findAll();

		logger.info("Retrieved {} products from the database.", products.size());

		
		System.out.println("Wrirtten by SUbbu-------------");
		
		return products;
	}

	public List<ProductPriceListDTO> getProducts() {
		logger.info("getProducts() service method is called.");

		List<ProductPriceListDTO> products = productsRepo.findProductPriceDetails();

		logger.info("Retrieved {} product price details.", products.size());

		return products;
	}
}
