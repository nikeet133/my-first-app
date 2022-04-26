package com.dlithe.cars.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping("test")
    public String myFirstMethod(){
        return "Hey guys!!! Its me, Springboot endpoint response";
    }


}
