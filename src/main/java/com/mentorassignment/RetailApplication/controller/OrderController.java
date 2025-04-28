package com.mentorassignment.RetailApplication.controller;

import com.mentorassignment.RetailApplication.model.Order;
import com.mentorassignment.RetailApplication.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderRepository repo;

    @Autowired
    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/get")
    public List<Order> getOrder(){
        return repo.findAll();
    }

    @PostMapping("/add")
    public void addOrder(@RequestBody Order order){
        repo.save(order);
    }

    @DeleteMapping("remove/{id}")
    public void deleteOrder(@PathVariable("id") Order order){
        repo.delete(order);
    }

    @PutMapping("update/{id}")
    public void updateOrder(@PathVariable String id,@RequestBody Order order){
        repo.save(order);
    }
}
