package co.develhope.FirstAPI04.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping("")
    public String getHeaders(@RequestHeader(value = "Host") String headers) {
        return headers;
    }
}
