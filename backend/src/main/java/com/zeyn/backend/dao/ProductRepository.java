package com.zeyn.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeyn.backend.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
