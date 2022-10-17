package co.develhope.Swagger01_DIGREGOLI.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    public String username;
    public String password;
    @GetMapping("/welcome")
    @ApiOperation(
            value = "Welcome message!",
            notes = "Prints out Hello to greet the user")
    public String welcome() {
        return "Hello!";
    }

    @GetMapping("/welcome_user")
    @ApiOperation(
            value = "Custom welcome message!",
            notes = "Prints a customized welcome message with the name of the user")
    public String welcomeUser(@RequestParam String name) {
        return String.format("Hello %s %s %d", name, "Di Gregoli", 911);
    }

    @PostMapping("/save_username")
    @ApiOperation(
            value = "Save username",
            notes = "Save a new username into the database")
    public void saveUsername(
            @ApiParam(value = "The username that we want to save into the database")
            @RequestParam String username,
            @ApiParam(value = "The password that we want to save into the database")
            @RequestParam String password) {
        this.username = username;
        this.password = password;
    }

    @GetMapping("/read_username")
    @ApiOperation(
            value = "Read username",
            notes = "Read the username saved into the database")
    public String readUsername() {
        return this.username;
    }


}
