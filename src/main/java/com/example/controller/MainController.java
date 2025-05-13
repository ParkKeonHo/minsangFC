package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class MainController {

    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "index"; // JSP 파일 이름 (index.jsp)
    }
}