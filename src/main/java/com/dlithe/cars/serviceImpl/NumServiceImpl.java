package com.dlithe.cars.serviceImpl;

import com.dlithe.cars.service.NumService;
import org.springframework.stereotype.Service;

@Service
public class NumServiceImpl implements NumService {
    @Override
    public int addingTotal(int i) {
        int numOne = 10;
        int numTwo=2;
        return numOne * numTwo;
    }
}
