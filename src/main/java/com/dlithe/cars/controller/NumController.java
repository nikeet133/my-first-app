package com.dlithe.cars.controller;

import com.dlithe.cars.service.NumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumController {

    @Autowired
    public NumService numService;

    @GetMapping("total/{numOne}/{numTwo}")
    public int mySecoundMethod(@PathVariable int numOne, @PathVariable int numTwo) {
        return numService.addingTotal(numOne/numTwo);
    }

}
