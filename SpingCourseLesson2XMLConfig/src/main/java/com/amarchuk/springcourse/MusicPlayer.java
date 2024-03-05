package com.amarchuk.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> listMusic;
    private String name;
    private int volume;

    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public MusicPlayer() {

    }


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

    public void playMusic(){
        for (Music m: listMusic){
            System.out.println("Playing: "+ m.getSong());
        }
    }


}
