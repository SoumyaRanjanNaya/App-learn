package com.nt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nt.entity.Order;
import com.nt.service.OrderService;
//OrderController.java

@RestController
@RequestMapping("/api/orders")
public class OrderController {
 @Autowired
 private OrderService orderService;

 @GetMapping
 public List<Order> getAllOrders() {
     return orderService.getAllOrders();
 }

 @GetMapping("/{id}")
 public Order getOrderById(@PathVariable Long id) {
     return orderService.getOrderById(id);
 }

 @PostMapping
 public Order createOrder(@RequestBody Order order) {
     return orderService.createOrder(order);
 }

 @PutMapping("/{id}")
 public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
     order.setId(id);
     return orderService.updateOrder(order);
 }

 @DeleteMapping("/{id}")
 public void deleteOrder(@PathVariable Long id) {
     orderService.deleteOrder(id);
 }
}
