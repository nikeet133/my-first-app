package com.dlithe.cars.controller;

import com.dlithe.cars.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    public TestService testService;


    @GetMapping("fetch-car-details/{carName}")
    public String detail(@PathVariable String carName) {
        return testService.fetchCarDetails(carName);


    }

}



