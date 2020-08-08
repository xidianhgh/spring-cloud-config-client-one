package com.example.configclientmaster.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/test")
@RestController
public class TestController {
    @Value("${testconfgi}")
    String testconfgi;

    @Value("${democonfigclient.message}")
    String message;

    @GetMapping("")
    public Map<String,Object> test(){
        Map<String,Object> map=new HashMap<>();
        map.put("success",true);
        map.put("value",testconfgi+"    "+message);
        return map;
    }

}
