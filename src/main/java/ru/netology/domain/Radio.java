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
        if (currentRadioChanel < 9) {
            currentRadioChanel += 1;
        }
        if (currentRadioChanel == 9) {
            this.currentRadioChanel = 0;
        }
    }

    public void prevRadioChanel() {
        if (currentRadioChanel > 0) {
            currentRadioChanel -= 1;
        }
        if (currentRadioChanel == 0) {
            this.currentRadioChanel = 9;
        }
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume <= 10 && currentRadioVolume >= 0)
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
