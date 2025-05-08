package com.mentorassignment.RetailApplication.repository;

import com.mentorassignment.RetailApplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
