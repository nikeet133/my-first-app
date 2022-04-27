package com.dlithe.cars.serviceImpl;

import com.dlithe.cars.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public String fetchCarDetails(String carName) {
        if (carName != null) {
            switch (carName) {
                case "Mastang GT":
                    return "This car is very attractive car";
                case "Supra fighter":
                    return "It is that Supraaa... ";
                default:
                    return "Not car details found";
            }

        }else {
            return "car name cannot find";
        }
    }
}
