package com.sap.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.dto.ApiResponse;
import com.sap.dto.ProductPriceListDTO;
import com.sap.entity.Products;
import com.sap.service.GetProductsService;

@RestController
public class GetProductsController {

    @Autowired
    GetProductsService productservice;

    private static final Logger logger = LoggerFactory.getLogger(GetProductsController.class);

    @GetMapping("/GetProducts")
    public List<Products> getProducts() {
        logger.info("getProducts API is called.");

        List<Products> products = productservice.getProductsE();

        logger.info("Fetched {} products from service.", products.size());

        return products;
    }

    @GetMapping("/GetProductspriceList")
    public ApiResponse<ProductPriceListDTO> getProductsList() {
        logger.info("getProductsPriceList API is called.");

        List<ProductPriceListDTO> products = productservice.getProducts();

        logger.info("Fetched {} product price list entries.", products.size());

        return new ApiResponse<>(200, "Product Master Data", products);
    }
}
