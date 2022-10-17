package co.develhope.Swagger02_DIGREGOLI.controllers;

import co.develhope.Swagger02_DIGREGOLI.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

/*
 Esercizio da rivedere
 */
@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/welcome")
    public String welcomeMathMessage() {
        return "Welcome!";
    }

    @GetMapping("/division-info")
    public ArithmeticOperation divisionInfo() {
        return new ArithmeticOperation("Division", 2, "descrizione", new String[] {"salve"} );
    }

    @PostMapping("/multiplication")
    public void addMult(@RequestParam(required = false) int) {

    }


}
