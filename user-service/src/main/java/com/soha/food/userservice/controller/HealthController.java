package com.soha.food.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/actuator")
public class HealthController {

    @GetMapping
    public Map<String, String> health() {
        Map<String, String> map = new HashMap<>();
        map.put("status", "UP");
        map.put("service", "user-service");
        return map;
    }
}
