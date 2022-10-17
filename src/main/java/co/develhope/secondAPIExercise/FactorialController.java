package co.develhope.secondAPIExercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("/factorial/{n}")
    public String factorial(@PathVariable(required = true, value = "n") int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f*=i;
        }

        return  "Factorial of n: " + f;
    }
}
