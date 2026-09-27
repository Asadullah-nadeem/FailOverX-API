package com.FailOverX.HealthCheck;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheckController {

    @GetMapping("/api/check")
    public Map<String, String> checkStatus() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("message", "FailOverX-API is working correctly!");
        return response;
    }
}
