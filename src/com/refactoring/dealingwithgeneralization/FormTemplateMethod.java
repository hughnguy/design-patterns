package com.refactoring.dealingwithgeneralization;

import com.patterns.behavioral.templatemethod.Game;

public class FormTemplateMethod {

    /////// Problem ///////

    /**
     * Your subclasses implement algorithms that contain similar steps in the same order.
     */
    public abstract class Game {
        abstract void play();
    }

    public class Cricket extends Game {
        void play() {
            System.out.println("Cricket Game Initialized! Start playing.");
            System.out.println("Cricket Game Started. Enjoy the game!");
            System.out.println("Cricket Game Finished!");
        }
    }

    public class Football extends Game {
        void play() {
            System.out.println("Football Game Initialized! Start playing.");
            System.out.println("Football Game Started. Enjoy the game!");
            System.out.println("Football Game Finished!");
        }
    }


    /////// Solution ///////

    /**
     * Move the algorithm structure and identical steps to a superclass, and leave implementation of the different steps in the subclasses.
     */
    public abstract class Game2 {
        abstract void initialize();
        abstract void startPlay();
        abstract void endPlay();

        //template method
        // Set to final so cannot be overridden since this is a template (defined way of playing)
        public final void play(){

            //initialize the game
            initialize();

            //start game
            startPlay();

            //end game
            endPlay();
        }
    }

    public class Cricket2 extends Game2 {
        @Override
        void endPlay() {
            System.out.println("Cricket Game Finished!");
        }

        @Override
        void initialize() {
            System.out.println("Cricket Game Initialized! Start playing.");
        }

        @Override
        void startPlay() {
            System.out.println("Cricket Game Started. Enjoy the game!");
        }
    }

    public class Football2 extends Game2 {
        @Override
        void endPlay() {
            System.out.println("Football Game Finished!");
        }

        @Override
        void initialize() {
            System.out.println("Football Game Initialized! Start playing.");
        }

        @Override
        void startPlay() {
            System.out.println("Football Game Started. Enjoy the game!");
        }
    }

    /////////////////////
}
