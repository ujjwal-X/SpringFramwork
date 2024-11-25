package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome(){
        return "Welcome";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        return "User is Successfully Login";
    }



    @RequestMapping("/signup")
    @ResponseBody
    public String signUp(){
        return "User is Successfully Registered";
    }
}
