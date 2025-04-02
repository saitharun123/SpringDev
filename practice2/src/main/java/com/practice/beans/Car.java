package com.practice.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Car {
    private MusicSystem musicSystem;  // Optional dependency

    public Car() {
        System.out.println("🚗 Car object created!");
    }

    @Autowired(required = false) // This makes it OPTIONAL
    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
        System.out.println("✅ MusicSystem set in Car.");
    }

    public void startCar() {
        System.out.println("🚗 Car started!");
        if (musicSystem != null) {
            musicSystem.playMusic();
        } else {
            System.out.println("❌ No MusicSystem available.");
        }
    }

    // Method to change dependency at runtime
    public void changeMusicSystem(MusicSystem newMusicSystem) {
        this.musicSystem = newMusicSystem;
        System.out.println("🔄 MusicSystem changed in Car!");
    }
}

