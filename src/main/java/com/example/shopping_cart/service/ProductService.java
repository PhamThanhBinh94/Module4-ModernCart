package com.example.shopping_cart.service;

import com.example.shopping_cart.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    public Iterable<Product> findAll();

    public Product find(int id);
}
