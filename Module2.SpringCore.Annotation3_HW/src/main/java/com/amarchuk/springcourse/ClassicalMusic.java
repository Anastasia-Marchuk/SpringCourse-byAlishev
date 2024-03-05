package com.amarchuk.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my inicialization");
    }

    @PreDestroy
    public void doMyDestruction(){
        System.out.println("Doing my dictruction");
    }

    @Override
    public String getSong() {
        return "Classical music";
    }
}
