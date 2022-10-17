package co.develhope.firstAPI01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("ALL")
@RestController
public class NameController {

    public String name;

    @GetMapping("/name")
    public String getName(@RequestParam(required = false) String name) {
        return "Hello " + name;
    }

    @PostMapping("/reverse-name")
    public void reverseName(@RequestParam(required = false) String name) {

      StringBuilder stringBuilder = new StringBuilder(name);
      stringBuilder.reverse();
      this.name = stringBuilder.toString();
    }

    @GetMapping("/get-reversed-name")
    public String reversedName() {
        return "Reversed name: " + name;
    }
}
