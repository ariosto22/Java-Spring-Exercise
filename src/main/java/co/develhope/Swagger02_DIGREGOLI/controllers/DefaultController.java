package co.develhope.Swagger02_DIGREGOLI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "Welcome!";
    }
}
