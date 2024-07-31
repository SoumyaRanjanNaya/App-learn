package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nt.service.OrderStatusService;

@RestController
@RequestMapping("/api/order-status")
public class OrderStatusController {
    @Autowired
    private OrderStatusService orderStatusService;
    // Define REST endpoints for order status-related operations
}
