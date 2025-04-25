package com.mentorassignment.RetailApplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User{

	@JsonProperty("address")
	private String address;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("email")
	private String email;
}