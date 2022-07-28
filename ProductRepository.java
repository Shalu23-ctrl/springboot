package com.example.Spring_CrudExample.repository;

import com.example.Spring_CrudExample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

