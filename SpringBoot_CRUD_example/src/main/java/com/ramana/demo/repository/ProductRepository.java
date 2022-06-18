package com.ramana.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ramana.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
