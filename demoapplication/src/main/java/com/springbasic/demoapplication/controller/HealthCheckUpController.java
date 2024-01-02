package com.springbasic.demoapplication.controller;

import com.springbasic.demoapplication.service.HealthService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckUpController {



    @Autowired
    private HealthService service ;

    @GetMapping("/checkUp")
    public String healthStatus() {
        return service.healthCheck();
    }

}
