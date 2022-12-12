package com.example.assement1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ass1 {
    @GetMapping("/name")
    public String name() {
        return "My name is : Reshoof";
    }

    @GetMapping("/age")
    public String age() {
        return "My age is : 21";

    }

    @GetMapping("/check")
    public String check() {
        return "Everything OK";
    }

    @GetMapping("/healty")
    public String healty() {
        return "Server health is up and running";
    }

}
