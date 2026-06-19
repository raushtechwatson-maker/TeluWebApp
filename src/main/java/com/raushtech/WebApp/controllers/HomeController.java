package com.raushtech.WebApp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String homeGreet(){
        return "Welcome to WebApp Home....";
    }


    @RequestMapping("/about")
    public String about(){
        return "My Website is for Alert Danger..";
    }


}
