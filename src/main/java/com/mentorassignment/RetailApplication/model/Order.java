package com.mentorassignment.RetailApplication.model;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "VARCHAR(10)")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private UUID orderId;

    @JoinColumn(name = "order_summary_summary_id")
    private OrderSummary orderSummary;

    private LocalDateTime localDateTime;

    @JoinColumn(name = "user_user_id")
    private User user;


}
