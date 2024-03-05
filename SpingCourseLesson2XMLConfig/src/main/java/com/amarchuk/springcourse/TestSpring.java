package com.amarchuk.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Testing 1st option of configuration Spring Bean...");
        MusicPlayer musicPlayer=context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer musicPlayer2=context.getBean("musicPlayerBean", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println();


        System.out.println("Testing 2nd option of configuration Spring Bean...");
        MusicPlayer musicPlayer3=context.getBean("musicListBean", MusicPlayer.class);
        musicPlayer3.playMusic();
        System.out.println();

        System.out.println("Testing Singlton scope and Prototype scope...");
        MusicPlayer musicPlayer4=context.getBean("musicListBean", MusicPlayer.class);

//        Scope Singlton.
        boolean comparison = musicPlayer3 == musicPlayer4;
        System.out.println("musicPlayer3 = musicPlayer4 - "+comparison);
//        Check if objects have the same hash coe
        System.out.println(musicPlayer3);
        System.out.println(musicPlayer4);
        System.out.println();

//        Scope Prototype.
        boolean comparisonPrototype = musicPlayer == musicPlayer2;
        System.out.println("musicPlayer = musicPlayer2 - "+comparisonPrototype);
//        Check if objects have the same hash coe
        System.out.println("Check if objects have the same hash code:");
        System.out.println(musicPlayer);
        System.out.println(musicPlayer2);
        System.out.println();


//        -------------------------------------------

        System.out.println("Testing init and destroy method...");
        ClassicalMusic classicalMusic=context.getBean("classicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        System.out.println(classicalMusic.getSong());
        System.out.println();

        //        -------------------------------------------

        System.out.println("Testing factory method...");
        FunkMusic funkMusic=context.getBean("funkBean", FunkMusic.class);
        System.out.println(funkMusic.getSong());
        System.out.println();




        context.close();
    }
}
