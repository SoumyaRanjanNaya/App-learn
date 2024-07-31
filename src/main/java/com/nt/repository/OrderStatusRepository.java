package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.entity.OrderStatus;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Long> {
	
}
