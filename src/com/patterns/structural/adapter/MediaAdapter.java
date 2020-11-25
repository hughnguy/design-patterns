package com.patterns.structural.adapter;

import com.patterns.structural.adapter.advancedmediaplayer.AdvancedMediaPlayer;
import com.patterns.structural.adapter.mediaplayer.MediaPlayer;

public class MediaAdapter implements AdvancedMediaPlayer {
    MediaPlayer mediaPlayer;

    public MediaAdapter(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void playAdvancedStuff(String fileName) {
        mediaPlayer.play("unknown", fileName);
        // Logic for obtaining mp3 and converting to this interface goes here
        System.out.println("Converting mp3 file and playing advanced stuff. Name: " + fileName);
    }
}
