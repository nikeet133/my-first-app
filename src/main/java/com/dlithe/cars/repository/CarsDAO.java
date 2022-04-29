package com.dlithe.cars.repository;

import com.dlithe.cars.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsDAO extends JpaRepository<Cars, Integer> {
}
