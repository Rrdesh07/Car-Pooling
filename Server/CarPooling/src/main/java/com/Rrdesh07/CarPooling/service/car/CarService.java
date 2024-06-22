package com.Rrdesh07.CarPooling.service.car;

import com.Rrdesh07.CarPooling.Models.Car;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CarService {
    List<Car> getAllCars(Long userId);
    String addCar(@RequestBody Car car,Long userId);
    Car updateCar(Long userId,Long carId,@RequestBody Car car);
    String deleteCar(Long userId,Long carId);
}
