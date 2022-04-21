package ru.netology.domain;

public class Radio {

    private int currentRadioChanel;

    private int minRadioChanel = 0;

    private int maxRadioChanel = 9;

    private int currentRadioVolume;

    private int minRadioVolume = 0;

    private int maxRadioVolume = 100;

    public Radio() {
    }

    public Radio(int amountRadioChanel) {
        this.maxRadioChanel = amountRadioChanel - 1;
    }

    public int getCurrentRadioChanel() {
        return currentRadioChanel;
    }

    public void setCurrentRadioChanel(int currentRadioChanel) {
        if (currentRadioChanel >= minRadioChanel && currentRadioChanel <= maxRadioChanel)
            this.currentRadioChanel = currentRadioChanel;
    }

    public void nextRadioChanel() {
        this.currentRadioChanel += 1;
        if (currentRadioChanel == 10) {
            this.currentRadioChanel = minRadioChanel;
        }
    }

    public void prevRadioChanel() {
        this.currentRadioChanel -= 1;
        if (currentRadioChanel == -1) {
            this.currentRadioChanel = maxRadioChanel;
        }
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume >= minRadioVolume && currentRadioVolume <= maxRadioVolume)
            this.currentRadioVolume = currentRadioVolume;
    }

    public void increaseVolume() {
        if (currentRadioVolume < maxRadioVolume) {
            currentRadioVolume++;
        }
    }

    public void reduceVolume() {
        if (currentRadioVolume > minRadioVolume)
            currentRadioVolume--;
    }
}
// git branch flexible, git branch, git checkout flexible, git push -u origin flexible}
