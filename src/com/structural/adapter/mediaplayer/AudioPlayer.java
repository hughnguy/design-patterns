package com.structural.adapter.mediaplayer;

import com.structural.adapter.MediaAdapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        // normal support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
