package com.dlithe.cars.service;

import org.springframework.stereotype.Component;

@Component
public interface TestService {

    String fetchCarDetails(String carName);

}
