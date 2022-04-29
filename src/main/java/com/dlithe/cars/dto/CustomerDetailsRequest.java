package com.dlithe.cars.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CustomerDetailsRequest {

    private String name;
    private String mobileNum;
    private String quotation;

}
