package com.amarchuk.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

//        System.out.println("Testing 1st option of configuration Spring Bean...");
//        Music music=context.getBean("rockBean", Music.class);
//        Music music2=context.getBean("classicalMusic", Music.class);
//        System.out.println(music.getSong());
//        System.out.println(music2.getSong());
//        System.out.println();
//        --------------------------------

//        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic();
//        -------------------------------

        Computer computer=context.getBean("computer", Computer.class);
        System.out.println(computer);
//        -------------------------------


        context.close();

    }
}
