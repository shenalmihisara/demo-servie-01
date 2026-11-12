package com.abc.crm.service;

import com.abc.crm.entity.ProductEntity;
import com.abc.crm.dto.Product;
import com.abc.crm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductRepository repository;

    public void createProduct(Product  product){

        ProductEntity entity = new ProductEntity();
        entity.setName(product.getName());
        entity.setDescription(product.getDescription());
        entity.setPrice(product.getPrice());
        entity.setActive(product.isActive());

        repository.save(entity);
    }

    public Iterable<ProductEntity> getProduct(){
        return repository.findAll();
    }

}
