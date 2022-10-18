package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/sum")
    public int sum() {
        double number1 = (int) (Math.random()*50);
        double number2 = (int) (Math.random()*50);

        return (int) (number1 + number2);
    }

}