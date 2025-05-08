package com.mentorassignment.RetailApplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="orderSummary")
@Data
public class OrderSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long summaryId;

    @JoinColumn(name = "product_product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_user_id")
    private User user;


}
