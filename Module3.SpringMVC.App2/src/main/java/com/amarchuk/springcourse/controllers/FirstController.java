package com.amarchuk.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Class with simple requests
 */
@Controller
@RequestMapping ("/first")
public class FirstController {

    /**
    Methods without variable to GET request!
     */

    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }


    /**
     Methods with variables Name and Surname to GET request! Old version without annotat
     In Console it will be a message ""Hella, 'name' 'surname'
     */
    @GetMapping("/hiold")
    public String helloPersonPage(HttpServletRequest request){
        String name=request.getParameter("name");
        String surname=request.getParameter("surname");
        System.out.println("Hello, "+name+" "+surname);
        return "first/hello";
    }

    /**
     Methods with variables Name and Surname to GET request! New version with @RequestParam
     In Console it will be a message ""Hella, 'name' 'surname'
     */
    @GetMapping("/hinew")
    public String helloPersonPage(@RequestParam("name")String name, @RequestParam("surname")String surname){

        System.out.println("Hello, "+name+" "+surname);
        return "first/hello";
    }




}
