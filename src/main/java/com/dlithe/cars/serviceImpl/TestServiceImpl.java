package com.dlithe.cars.serviceImpl;

import com.dlithe.cars.dto.CustomerDetailsResponse;
import com.dlithe.cars.dto.CustomerDetailsRequest;
import com.dlithe.cars.dto.ReviewResponse;
import com.dlithe.cars.entity.Cars;
import com.dlithe.cars.repository.CarsDAO;
import com.dlithe.cars.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
    public CustomerDetailsResponse getCustomerDetail(int userId) {

        List<ReviewResponse> carsReview = new ArrayList<>();

        Optional<Cars> cars = carsDAO.findById(userId);
        Cars car = cars.get();

        CustomerDetailsResponse customerDetailsResponse = new CustomerDetailsResponse();
        customerDetailsResponse.setName(car.getName());
        customerDetailsResponse.setMobileNum(car.getMobileNum());


        ReviewResponse reviewResponse = new ReviewResponse();
        reviewResponse.setReview("this car is amzing");
        reviewResponse.setReviewName("nikeet patil");
        reviewResponse.setRating("5");


        ReviewResponse reviewResponse1 = new ReviewResponse();
        reviewResponse1.setReview("BMW cars is amzing and feature is good");
        reviewResponse1.setReviewName("priya pk");
        reviewResponse1.setRating("5.5");

        ReviewResponse reviewResponse2 = new ReviewResponse();
        reviewResponse2.setReview("Harrier is amzing and feature is good");
        reviewResponse2.setReviewName("shankar");
        reviewResponse2.setRating("5.5");


        carsReview.add(reviewResponse);
        carsReview.add(reviewResponse1);
        carsReview.add(reviewResponse2);


        customerDetailsResponse.setReview(carsReview);


        return customerDetailsResponse;

    }


}


