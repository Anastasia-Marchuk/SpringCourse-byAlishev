package com.amarchuk.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Class with simple requests and Model model
 */
@Controller
@RequestMapping ("/first")
public class FirstModelController {


    /**
     Methods with variables Name and Surname to GET request!
     Method with @RequestParam and Model model
     In Console it will be a message ""Hell0, 'name' 'surname'
     */
    @GetMapping("/himodel")
    public String helloPersonPage(@RequestParam("name")String name, @RequestParam("surname")String surname, Model model){

        model.addAttribute("message","Hello, "+name+" "+surname);

        return "first/hello-model";
    }



}
