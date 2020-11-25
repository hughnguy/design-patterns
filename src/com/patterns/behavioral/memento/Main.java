package com.patterns.behavioral.memento;

/**
 * Memento is a behavioral design pattern that lets you save and restore the previous state of
 * an object without revealing the details of its implementation.
 *
 * The Originator (TextWindow): object whose state needs to be saved (needs to save its currentText). Creates and stores states in memento objects.
 *
 * The Memento (TextWindowState): object holding the state being saved
 *
 * The Caretaker (TextEditor): the object triggering the save and restore of the state
 *
 * - Use the Memento pattern when you want to produce snapshots of the object’s state to be able to restore a previous state of the object.
 * - The Memento makes the object itself responsible for creating a snapshot of its state.
 * No other object can read the snapshot, making the original object’s state data safe and secure.
 */
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();
        textEditor.print();

        textEditor.write("Buy milk and eggs before coming home\n");
        textEditor.print();

        textEditor.hitUndo();
        textEditor.print();
    }
}
