package com.theja.learn.java;

public class TapeDeckTest {

    public static void main(String args[]){

        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.PlayTape();

        if (t.canRecord == true)
            t.TapeRecord();

    }
}
