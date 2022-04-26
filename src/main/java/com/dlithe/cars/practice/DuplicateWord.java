package com.dlithe.cars.practice;


import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWord {
    public static void main(String[] args) {

        String input="this is where all the rain water is harvested. So , where exactly is rain water harvested?";

        String[] result= input.split(" ");

        LinkedHashSet<String> set= new LinkedHashSet<>();
         for (int i=0 ; i < result.length; i++){
             set.add(result[i]);
         }
         System.out.println(set);

    }
}
