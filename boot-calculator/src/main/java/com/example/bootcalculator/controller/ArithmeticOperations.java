package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmeticOperations {
//    @GetMapping("/form")
//    public String addition(@RequestParam int num1, @RequestParam int num2) {
//        int sum = num1 + num2;
//        return "Sum is " + sum;
//    }
@GetMapping("/form")
public String addition() {
    return "Hey ";
}



//    @RequestMapping("/sub")
//    public int sub(int num1,int num2){
//        return num1-num2;
//    }
//
//
//    @RequestMapping("/mult")
//    public int mul(int num1,int num2){
//        return num1+num2;
//    }
}
