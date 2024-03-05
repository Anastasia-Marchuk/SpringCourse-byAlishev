package com.amarchuk.springcourse;

public class FunkMusic implements Music {

    public static FunkMusic getFunkMusic(){
        return new FunkMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initiaalization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "FUNK music";
    }
}
