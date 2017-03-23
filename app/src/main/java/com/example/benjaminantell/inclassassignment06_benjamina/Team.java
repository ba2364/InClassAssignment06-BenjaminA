package com.example.benjaminantell.inclassassignment06_benjamina;

import java.io.Serializable;

public class Team implements Serializable {
    private String city;
    private String nickname;
    private int champs;
    private boolean playing;

    public Team(String city, String nickname, int champs, boolean playing) {
        this.city = city;
        this.nickname = nickname;
        this.champs = champs;
        this.playing = playing;
    }

    public String getCity() {
        return city;
    }

    public String getNickname() {
        return nickname;
    }

    public int getChamps() {
        return champs;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setChamps(int champs) {
        this.champs = champs;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public String toString() {
        if (isPlaying()) {
            return "The " + city + " " + nickname + " have " + champs + " championships and still play. ";
        } else {
            return "The " + city + " " + nickname + " have " + champs + " championships and no longer play. ";
        }
    }
}