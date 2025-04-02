package com.sap.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.sap.dto.ProductDTO;
import com.sap.repository.ProductsRepo;

@Service
public class GetProductsServicenew {

    private static final Logger logger = LoggerFactory.getLogger(GetProductsServicenew.class);

    @Autowired
    ProductsRepo productsRepo;

    public List<ProductDTO> getProducts() {
        logger.info("getProducts() service method is called.");

        List<ProductDTO> products = productsRepo.findSpecificColumns(); // Fetch only the required columns

        logger.info("Retrieved {} product records.", products.size());

        return products;
    }
}
