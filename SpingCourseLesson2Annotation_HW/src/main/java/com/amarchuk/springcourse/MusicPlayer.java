package com.amarchuk.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class MusicPlayer {

    private Music classical;
    private Music rock;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classical,@Qualifier("rockMusic") Music rock) {
        this.classical = classical;
        this.rock = rock;
    }


    public String playMusic(MusicGendre gendre){

        Random random=new Random();
        int randomNumber = random.nextInt(3);

        if (gendre == MusicGendre.CLASSICAL){
            return "Playing "+ classical.getSong(randomNumber);

        } else {
            return "Playing "+ rock.getSong(randomNumber);
        }
    }



}
