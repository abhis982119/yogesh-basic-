package com.springbasic.demoapplication.service;

import org.springframework.stereotype.Service;


@Service
public class HealthService {

    public String healthCheck(){
        return "Up & Running";
    }
}
