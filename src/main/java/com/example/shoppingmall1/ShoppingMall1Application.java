package com.example.shoppingmall1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ShoppingMall1Application {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMall1Application.class, args);
    }

    @GetMapping(value = "/")
    public String HelloWorld(){
        return "Hello world";
    }

}
