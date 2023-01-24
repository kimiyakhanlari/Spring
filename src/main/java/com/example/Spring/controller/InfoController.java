package com.example.Spring.controller;

import com.example.Spring.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping(value = "/info/{name}")
    public String getInfo(@PathVariable String name){
        return infoService.getInfo("name");
    }


    
    @GetMapping(value = "/first")
    public String firstRest(){
        return "First Rest";
    }
    @GetMapping(value = "/second")
    public String secondtRest(){
        return "second Rest";
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String thirdtRest(){
        return "third Rest";
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String forthRest(){
        return "forth Rest";
    }
    @PostMapping(value = "/post")
    public String postRest(){
        return "post Rest";
    }

    @DeleteMapping(value = "/delete")
    public String deleteRest(){
        return "delete Rest ";
    }

    @PutMapping(value = "/put")
    public String putRest(){
        return "put Rest";
    }
}
