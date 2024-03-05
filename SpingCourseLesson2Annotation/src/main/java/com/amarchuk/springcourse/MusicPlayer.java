package com.amarchuk.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {


    private Music music;
    private Music music2;

    @Autowired

    public MusicPlayer(@Qualifier("classicalMusic") Music music,@Qualifier("rockMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private List<Music> listMusic;
    private String name;
    private int volume;

//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music=music;
//    }

//    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic,  RockMusic rockMusic) {
        this.classicalMusic=classicalMusic;
        this.rockMusic=rockMusic;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public RockMusic getRockMusic() {
        return rockMusic;
    }

    public void setRockMusic(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }

    public Music getMusic() {
        return music;
    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//    @Autowired
//    public MusicPlayer(List<Music> listMusic) {
//        this.listMusic = listMusic;
//    }
//
//    @Autowired
//    public MusicPlayer() {
//    }

    public ClassicalMusic getClassicalMusic() {
        return classicalMusic;
    }

    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic=classicalMusic;
//    }




    public List<Music> getListMusic() {
        return listMusic;
    }

    public void setListMusic(List<Music> listMusic) {
        this.listMusic = listMusic;
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
//        System.out.println("Playing: "+ rockMusic.getSong());
    }

    public void playSong(){
       System.out.println("Playing: "+ music.getSong());

    }


}
