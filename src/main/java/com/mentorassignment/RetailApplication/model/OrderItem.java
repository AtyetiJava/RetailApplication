package com.mentorassignment.RetailApplication.model;

//import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderItem{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public int productId;
	public int quantity;
	public double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderItem{" +
				"price=" + price +
				", productId=" + productId +
				", quantity=" + quantity +
				'}';
	}
}