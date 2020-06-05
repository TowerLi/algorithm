package com.abchina.webdemo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping(value = "/springboot")
public class UserController {
    @RequestMapping(value = "/getUserByGet")
    String getUserByGet() {
        return "Hello" ;
    }
}
