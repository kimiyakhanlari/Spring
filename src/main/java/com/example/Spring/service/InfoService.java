package com.example.Spring.service;

import org.springframework.stereotype.Service;

@Service
public class InfoService {
    public String getInfo(String name){
        System.out.print(name);
        return "Hello"+name;
    }
}
