package com.dlithe.cars.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CustomerDetailsResponse {

    private String name;
    private String mobileNum;

    private List<ReviewResponse> review;


}
