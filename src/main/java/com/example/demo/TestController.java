package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;

@RestController
public class TestController {

    @GetMapping("/test")
    public String index() {
        return "Test Controller!";
    }

}