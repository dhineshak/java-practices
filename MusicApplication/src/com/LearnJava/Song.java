package com.LearnJava;

public class Song {
    private String name;
    private float duration;

    public Song(String name, float duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public float getDuration() {
        return duration;
    }
}
