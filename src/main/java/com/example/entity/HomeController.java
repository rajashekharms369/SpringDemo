package com.example.entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<>("Welcome to my app", HttpStatus.OK);
    }
}
