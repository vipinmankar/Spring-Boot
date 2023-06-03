package com.example.sms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
