package com.abhiram.drools.example.controller;

import com.abhiram.drools.example.model.Order;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    @Autowired
    private KieSession session;

    @PostMapping("/order")
    public Order createOrder(@RequestBody Order order) {
        session.insert(order);
        session.fireAllRules();
        return order;
    }
}
