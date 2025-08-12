package com.tomazbr9.product_service.service;

import com.tomazbr9.product_service.model.Product;
import com.tomazbr9.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product findById(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));

    }

    public Product createProduct(Product product) {
        return repository.save(product);
    }
}
