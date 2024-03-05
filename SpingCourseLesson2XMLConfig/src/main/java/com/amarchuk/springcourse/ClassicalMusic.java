package com.amarchuk.springcourse;

public class ClassicalMusic implements Music {

    public void doMyInit(){
        System.out.println("Doing my initiaalization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Classical music";
    }
}
