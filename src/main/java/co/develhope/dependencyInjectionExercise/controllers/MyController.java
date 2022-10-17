package co.develhope.dependencyInjectionExercise.controllers;

import co.develhope.dependencyInjectionExercise.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("MyController constructor has been called");
        this.myService = myService;
    }

    @GetMapping("/helloMsg")
    public String helloMsg(@RequestParam(required = true) String name) {
        return "Hello " + name;
    }

    @GetMapping("/getName")
    public String getName() {
        return myService.getName();
    }
}
