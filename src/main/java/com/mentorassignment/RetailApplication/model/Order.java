package com.mentorassignment.RetailApplication.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Order{

	@JsonProperty("total")
	private Object total;

	@JsonProperty("orderId")
	private int orderId;

	@JsonProperty("userId")
	private int userId;

	@JsonProperty("items")
	private List<ItemsItem> items;

	@JsonProperty("orderDate")
	private String orderDate;

	@JsonProperty("status")
	private String status;
}