package com.abc.crm.controller;

import com.abc.crm.dto.Product;
import com.abc.crm.entity.ProductEntity;
import com.abc.crm.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductServiceImpl service;

    @PostMapping("/product/create")
    void createProduct(@RequestBody Product product){
        service.createProduct(product);
    }

    @GetMapping("/product/all")
    Iterable<ProductEntity> getProducts(){
        return service.getProduct();
    }

}
