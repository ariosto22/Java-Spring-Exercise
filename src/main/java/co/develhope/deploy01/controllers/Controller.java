package co.develhope.deploy01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping("")
    public String devNameString() {
        String devName = environment.getProperty("devName.mydevName");
        return devName ;
    }
}
