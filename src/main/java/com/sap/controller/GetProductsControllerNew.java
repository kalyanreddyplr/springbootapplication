package com.sap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sap.dto.ProductDTO;
import com.sap.service.GetProductsServicenew;

import java.util.List;

@RestController
public class GetProductsControllerNew {

    @Autowired
    GetProductsServicenew productservice;

    @GetMapping("/GetProductsnew")
    public List<ProductDTO> getProducts() {
        System.out.println("getProducts controller is calling");
        List<ProductDTO> products = productservice.getProducts();
        return products;
    }
}
