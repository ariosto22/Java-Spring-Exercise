package co.develhope.FirstAPI03.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {


    @GetMapping(value = "/s1")
    public String stringsConcatenated1Params(@RequestParam(required = true) String str1) {
        return str1;
    }

    @GetMapping(value = "/s2")
    public String stringsConcatenated2Params(@RequestParam(required = true) String str1, @RequestParam(required = false) String str2) {
        if(str2 == null) {
            return str1;
        }
        return str1 + " " + str2;
    }
}
