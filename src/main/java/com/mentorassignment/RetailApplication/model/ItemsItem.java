package com.mentorassignment.RetailApplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ItemsItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long productId;
	private int quantity;
}
