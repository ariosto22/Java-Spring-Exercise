package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private Environment environment;

    @GetMapping("")
    public String getProperties() {

        String property1 = environment.getProperty("myCustomProps.devName");
        String property2 = environment.getProperty("myCustomProps.authCode");

        return property1 + " " + property2;
    }
}