package com.mentorassignment.RetailApplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderItem{

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("productId")
	private int productId;

	@JsonProperty("price")
	private Object price;
}