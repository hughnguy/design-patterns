package com.patterns.structural.adapter.advancedmediaplayer;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playAdvancedStuff(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
}
