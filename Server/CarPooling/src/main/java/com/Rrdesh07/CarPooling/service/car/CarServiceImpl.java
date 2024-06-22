package com.Rrdesh07.CarPooling.service.car;

import com.Rrdesh07.CarPooling.Models.Car;
import com.Rrdesh07.CarPooling.Models.User;
import com.Rrdesh07.CarPooling.Repository.CarRepository;
import com.Rrdesh07.CarPooling.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    UserRepository userRepository;
    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> getAllCars(Long userId) {
        Optional<User> user=userRepository.findById(userId);
        if(user.isPresent()){
            List<Car> cars=user.get().getCars();
            return cars;
        }
        return null;
    }

    @Override
    public String addCar(Car car, Long userId) {
        Optional<User> user=userRepository.findById(userId);
        if(user.isPresent()){
            User userData=user.get();
            carRepository.save(car);
            List<Car> cars=userData.getCars();
            cars.add(car);
            userRepository.save(userData);
            return "car added successfully!!";
        }
        return "userId doesn't exist";
    }

    @Override
    public Car updateCar(Long userId, Long carId, Car car) {
        Optional<Car> carDB=carRepository.findById(carId);
       if(carDB.isPresent()) {
         Car carData = carDB.get();
         carData.setName(car.getName());
         carData.setType(car.getType());
         carData.setUserId(car.getUserId());
         carData.setNoPlate(car.getNoPlate());
         carData.setNoOfBookedSeats(car.getNoOfBookedSeats());
         carData.setTotalNoOfSeats(car.getTotalNoOfSeats());
         carRepository.save(car);
         return car;
       }
       return null;
    }

    @Override
    public String deleteCar(Long userId, Long carId) {
        Boolean isCarExist=carRepository.existsById(carId);
        if(isCarExist){
            carRepository.deleteById(carId);
            return "Car removed successfully!!";
        }
        else{
            return "CarId doesn't Exist!!";
        }
    }
}
