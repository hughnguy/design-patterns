package com.patterns.structural.adapter;

import com.patterns.structural.adapter.advancedmediaplayer.AdvancedMediaPlayer;
import com.patterns.structural.adapter.advancedmediaplayer.Mp4Player;
import com.patterns.structural.adapter.mediaplayer.AudioPlayer;

/**
 * The adapter pattern converts the interface of a class into another interface that the client expects.
 * Adapter lets classes work together that could not otherwise because of incompatible interfaces.
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song");

        // Advanced media player is the target interface which we need to support
        AdvancedMediaPlayer player = new Mp4Player();
        playAdvanceSong(player);

        // Audio player can now be passed into playAdvanceSong and understood by client using the adapter
        AdvancedMediaPlayer adapter = new MediaAdapter(audioPlayer);
        playAdvanceSong(adapter);
    }

    // Client method can use this same interface
    private static void playAdvanceSong(AdvancedMediaPlayer player) {
        player.playAdvancedStuff("song");
    }
}
