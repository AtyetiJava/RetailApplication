package com.mentorassignment.RetailApplication.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="cart")
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderNumber;

    private List<Product> productList;

    @OneToOne
    @JoinColumn(name = "user_user_id")
    private User user;


}
