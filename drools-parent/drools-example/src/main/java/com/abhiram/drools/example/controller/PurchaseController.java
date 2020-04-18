package com.abhiram.drools.example.controller;

import com.abhiram.drools.example.model.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    @PostMapping("/order")
    public String createOrder(@RequestBody Order order) {
        return null;
    }
}
