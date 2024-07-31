package com.nt.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Order order;
    private String status;
    private LocalDateTime statusDate;
    
    // generating getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(LocalDateTime statusDate) {
		this.statusDate = statusDate;
	}
	
	// generate constructor with param
	public OrderStatus(Long id, Order order, String status, LocalDateTime statusDate) {
		super();
		this.id = id;
		this.order = order;
		this.status = status;
		this.statusDate = statusDate;
	}
	
	// generate constructor without param
	public OrderStatus() {
		super();
	}
  
	
	
    
}
