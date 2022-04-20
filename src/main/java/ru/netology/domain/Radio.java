package ru.netology.domain;

public class Radio {

    private int currentRadioChanel;
    private int currentRadioVolume;

    public int getCurrentRadioChanel() {
        return currentRadioChanel;
    }

    public void setCurrentRadioChanel(int currentRadioChanel) {
        if (currentRadioChanel >= 0 && currentRadioChanel <= 9)
            this.currentRadioChanel = currentRadioChanel;
    }

    public void nextRadioChanel() {
        this.currentRadioChanel += 1;
        if (currentRadioChanel == 10) {
            this.currentRadioChanel = 0;
        }
    }

    public void prevRadioChanel() {
        this.currentRadioChanel -= 1;
        if (currentRadioChanel == -1) {
            this.currentRadioChanel = 9;
        }
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume >= 0 && currentRadioVolume <= 10)
            this.currentRadioVolume = currentRadioVolume;
    }

    public void increaseVolume() {
        if (currentRadioVolume < 10) {
            currentRadioVolume++;
        }
    }

    public void reduceVolume() {
        if (currentRadioVolume > 0)
            currentRadioVolume--;
    }
}
