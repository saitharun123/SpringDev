package com.practice.beans;


import org.springframework.stereotype.Component;

@Component // remove this annotation and observe the change in output 
public class MusicSystem {
    public void playMusic() {
        System.out.println("🎵 Playing music...");
    }
}

