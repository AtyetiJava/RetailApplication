package com.mentorassignment.RetailApplication.repository;

import com.mentorassignment.RetailApplication.model.OrderSummary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderSummaryRepository extends JpaRepository<OrderSummary, Long> {
}
