package co.develhope.crud_exercise.controllers;

import co.develhope.crud_exercise.entities.Car;
import co.develhope.crud_exercise.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping("")
    public Car createCar(@RequestBody Car car) {
        return carRepository.saveAndFlush(car);
    }

    @GetMapping("")
    public List<Car> getAllCar() {
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable long id) {
        if(carRepository.existsById(id)) {
            return carRepository.findById(id);
        }else {
             return Optional.of(new Car());
        }
    }

    /*
    Problema con il setType di Car
     */
    @PutMapping("/{id}")
    public Optional<Car> editCar(@RequestParam String type, @PathVariable long id) {
        Optional<Car> car;
        if(carRepository.existsById(id)) {
          car = carRepository.findById(id);
          car = toString(Optional.ofNullable(type));
          car = carRepository.saveAndFlush(car);
        }

        return Optional.of(new Car());
    }

    @DeleteMapping("/{id}")
    public void deleteSingleCar(@PathVariable long id, HttpServletResponse response) {
        if(carRepository.existsById(id)) {
            carRepository.deleteById(id);

        }
        response.setStatus(409);
    }

    @DeleteMapping("")
    public void deleteAllCars() {
        carRepository.deleteAll();
    }
}
