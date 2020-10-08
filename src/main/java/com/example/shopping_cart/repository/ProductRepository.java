package com.example.shopping_cart.repository;

import com.example.shopping_cart.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

}
