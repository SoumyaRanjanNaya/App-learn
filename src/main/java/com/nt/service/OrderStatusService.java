package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nt.repository.OrderStatusRepository;

@Service
public class OrderStatusService {
    @Autowired
    private OrderStatusRepository orderStatusRepository;
    // Implement service methods
}
