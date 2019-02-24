package com.example.controller;

import com.example.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }


    @GetMapping("/hello1")
    public String hello(@RequestParam String name){
        return "hello " + name;
    }

    @GetMapping("/hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age){
        return new User(name, age);
    }

    @PostMapping("/hello3")
    public String hello(@RequestBody User user){
        return "hello " + user.getName() + " ," + user.getAge();
    }
}
