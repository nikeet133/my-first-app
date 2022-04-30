package com.dlithe.cars.controller;

import com.dlithe.cars.dto.CustomerDetailsResponse;
import com.dlithe.cars.dto.CustomerDetailsRequest;
import com.dlithe.cars.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    public TestService testService;


    @GetMapping("fetch-car-details/{carName}")
    public String detail(@PathVariable String carName) {
        return testService.fetchCarDetails(carName);


    }

    @PostMapping("register-customer")
    public String registerCustomerDetails(@RequestBody CustomerDetailsRequest customerDetailsRequest){

        return testService.registerCustomer(customerDetailsRequest);
    }


    @GetMapping("get-user-review/{userId}")
    public CustomerDetailsResponse fetchUserDetails(@PathVariable int userId){
        return testService.getCustomerDetail(userId);
    }
}






