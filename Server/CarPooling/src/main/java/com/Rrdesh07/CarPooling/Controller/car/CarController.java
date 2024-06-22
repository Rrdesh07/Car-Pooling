package com.Rrdesh07.CarPooling.Controller.car;

import com.Rrdesh07.CarPooling.Models.Car;
import com.Rrdesh07.CarPooling.service.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1.0/cars/{userId}")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getAllCars(@PathVariable Long userId){
        List<Car> cars=carService.getAllCars(userId);
        return cars;
    }

    @PostMapping
    public String addCar(@RequestBody Car car,@PathVariable Long userId){
        String carData= carService.addCar(car,userId);
        return carData;
    }

    @PutMapping
    public Car updateCar(@PathVariable Long userId,@RequestParam Long carId, @RequestBody Car car){
        Car updatedCar=carService.updateCar(userId,carId,car);
        return updatedCar;
    }

    @DeleteMapping
    public String deleteCar(@PathVariable Long userId,@RequestParam Long carId){
        String isCarDeleted=carService.deleteCar(userId,carId);
        return isCarDeleted;
    }
}
