package com.amarchuk.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Calculator with simple requests and Model model
 */
@Controller
@RequestMapping ("/")
public class CalculatorController {


    @GetMapping("/calc")
    public String calculate(@RequestParam("a")Integer a, @RequestParam("b")Integer b,@RequestParam("c")String c, Model model){
        double result;
        switch (c){
            case "+": result=a+b;
               break;
            case "-": result=a-b;
               break;
            case "*": result=a*b;
                break;
            case "/": result = a/(double)b;
                break;
            default:
                result=0;

        }


        model.addAttribute("message","Example: "+a+c.toString()+b+"="+result);

        return "/calculator";
    }



}
