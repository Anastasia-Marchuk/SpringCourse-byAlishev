package com.amarchuk.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {


    private Music music;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;

    @Value( "${musicPlayer.volume}")
    private int volume;

    @Autowired

    public MusicPlayer(@Qualifier("classicalMusic") Music music,@Qualifier("rockMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }


    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Music getMusic2() {
        return music2;
    }

    public void setMusic2(Music music2) {
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic(){
        return "Playing: "+ music.getSong()+", playing "+music2.getSong();
    }

    public void playSong(){
       System.out.println("Playing: "+ music.getSong());

    }


}
