package org.example.tekeksamen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EksamenController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to TekEksamen";
    }
}
