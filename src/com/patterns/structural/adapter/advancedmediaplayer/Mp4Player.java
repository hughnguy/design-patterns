package com.patterns.structural.adapter.advancedmediaplayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playAdvancedStuff(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
