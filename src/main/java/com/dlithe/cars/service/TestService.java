package com.dlithe.cars.service;

import com.dlithe.cars.dto.CustomerDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {

    String fetchCarDetails(String carName);//get mapping


    String registerCustomer(CustomerDetailsRequest customerDetailsRequest);//post mapping

}
