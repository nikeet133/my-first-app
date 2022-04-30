package com.dlithe.cars.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ReviewResponse {

    private String reviewName;
    private String review;
    private String rating;


}
