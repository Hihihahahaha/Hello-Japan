package edu.hanu.a1_2001040126;


public class Item {
    int inmage;
    boolean playable;
    int sound;

    public Item(int inmage, int sound) {
        this.inmage = inmage;
        this.sound = sound;
        if (inmage  == -1 )
            playable = false;
        else
            playable = true;
    }

    public int getInmage() {
        return inmage;
    }

    public int getSound() {
        return sound;
    }

    public boolean isPlayable() {
        return playable;
    }
}

