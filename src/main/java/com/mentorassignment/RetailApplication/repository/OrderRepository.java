package com.mentorassignment.RetailApplication.repository;

import com.mentorassignment.RetailApplication.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
