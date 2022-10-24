package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private BasicService basicService;

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping("/")
    public String sayHello() {
        logger.info(">> INFO logging: sayHello() - START");
        logger.info(">> INFO logging: sayHello() - END");
        return "Hello there!";
    }

    @GetMapping("/exp")
    public int getPow() {
        return basicService.getPow();
    }

    @GetMapping("/get-errors")
    public void getErrors() throws Error {
        logger.error(">> ERROR logging: ");
        throw new Error("This is the custom error");
    }
}