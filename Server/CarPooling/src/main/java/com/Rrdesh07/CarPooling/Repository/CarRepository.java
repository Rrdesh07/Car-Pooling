package com.Rrdesh07.CarPooling.Repository;

import com.Rrdesh07.CarPooling.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
