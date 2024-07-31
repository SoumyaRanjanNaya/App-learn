package com.nt.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="ORDERS_TABLE")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    @ManyToOne
    private Customer customer;
    private LocalDateTime orderDate;
    
    
    // generating getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	
	 // generate constructor with param
	public Order(Long id, String orderNumber, Customer customer, LocalDateTime orderDate) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.customer = customer;
		this.orderDate = orderDate;
	}
	
	// generate constructornon param
	public Order() {
		super();
	}
	
   
    
    
}
