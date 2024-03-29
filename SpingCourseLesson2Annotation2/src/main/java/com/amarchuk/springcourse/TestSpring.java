package com.amarchuk.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

//        Computer computer=context.getBean("computer", Computer.class);
//        System.out.println(computer);
//        -------------------------------

        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1=context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2=context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println("Testing singleton @scope...");
        System.out.println("classicalMusic1 == classicalMusic2 -" +(classicalMusic1 == classicalMusic2));

        RockMusic rockMusic1=context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic2=context.getBean("rockMusic", RockMusic.class);

        System.out.println("Testing prototype @scope...");
        System.out.println("rockMusic1 == rockMusic2 -"+(rockMusic1 == rockMusic2));


        context.close();

    }
}
