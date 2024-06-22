package com.Rrdesh07.CarPooling.service.car;

import com.Rrdesh07.CarPooling.Models.Car;
import com.Rrdesh07.CarPooling.Models.User;
import com.Rrdesh07.CarPooling.Repository.CarRepository;
import com.Rrdesh07.CarPooling.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
            car.setUserId(userData);
            carRepository.save(car);
            return "car added successfully!!";
        }
        return "userId doesn't exist";
    }

    @Override
    public Car updateCar(Long userId, Long carId, @RequestBody Car car) {
        Optional<Car> carDB=carRepository.findById(carId);
        Optional<User> userDB=userRepository.findById(userId);
        if(carDB.isPresent() && userDB.isPresent()) {
         User userData=userDB.get();
         Car carData = carDB.get();
         carData.setUserId(userData);
         carData.setName(car.getName());
         carData.setType(car.getType());
         carData.setNoPlate(car.getNoPlate());
         carData.setNoOfBookedSeats(car.getNoOfBookedSeats());
         carData.setTotalNoOfSeats(car.getTotalNoOfSeats());
         carRepository.save(carData);
         return carData;
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
