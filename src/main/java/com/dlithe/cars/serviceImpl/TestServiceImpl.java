package com.dlithe.cars.serviceImpl;

import com.dlithe.cars.dto.CarDetailsResponse;
import com.dlithe.cars.dto.CustomerDetailsRequest;
import com.dlithe.cars.entity.Cars;
import com.dlithe.cars.repository.CarsDAO;
import com.dlithe.cars.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private CarsDAO carsDAO;


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

        } else {
            return "car name cannot find";
        }
    }


    @Override
    public String registerCustomer(CustomerDetailsRequest customerDetailsRequest) {

        Cars cars = new Cars();
        cars.setName(customerDetailsRequest.getName());
        cars.setMobileNum(customerDetailsRequest.getMobileNum());
        cars.setQuotation(customerDetailsRequest.getQuotation());


        carsDAO.save(cars);
        return " Registration successfully!!  Welcome to in cars Application";


    }

    @Override
    public CarDetailsResponse getCustomerDetail(int userId) {

        Optional<Cars> cars= carsDAO.findById(userId);
        Cars car=cars.get();

        CarDetailsResponse carDetailsResponse = new CarDetailsResponse();
        carDetailsResponse.setName(car.getName());
        carDetailsResponse.setMobileNum(car.getMobileNum());

        return carDetailsResponse;


    }
}


