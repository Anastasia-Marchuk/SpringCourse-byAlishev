package com.amarchuk.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    public void doMyInit(){
        System.out.println("Doing my initiaalization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    private List<String> classicalList = new ArrayList<>();

    {
        classicalList.add("Classical song - 1");
        classicalList.add("Classical song - 2");
        classicalList.add("Classical song - 3");
    }

    public List<String> getClassicalList() {
        return classicalList;
    }

    public void setClassicalList(List<String> classicalList) {
        this.classicalList = classicalList;
    }

    @Override
    public String getSong(int num) {
        return classicalList.get(num);
    }
}
