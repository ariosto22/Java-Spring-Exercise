package co.develhope.FirstAPI05.controllers;

import co.develhope.FirstAPI05.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping("")
    public CarDTO getCar(@RequestParam(required = true) String id, @RequestParam(required = true) String modelName, @RequestParam(required = false) double price) {
        return new CarDTO(id, modelName, price);
    }

    @PostMapping("")
    public String postCar(@Valid @RequestBody(required = false) CarDTO carDTO) {
        System.out.println(carDTO.toString());
        return HttpStatus.CREATED + "\n" + carDTO.toString();
    }

}
