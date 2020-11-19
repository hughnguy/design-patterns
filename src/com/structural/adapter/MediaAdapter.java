package com.structural.adapter;

import com.structural.adapter.advancedmediaplayer.AdvancedMediaPlayer;
import com.structural.adapter.mediaplayer.MediaPlayer;

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
