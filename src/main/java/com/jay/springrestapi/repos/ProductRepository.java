package com.jay.springrestapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jay.springrestapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
