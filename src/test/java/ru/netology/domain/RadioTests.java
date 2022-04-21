package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTests {

    @Test
    public void shouldSnowCustomRadioInTheMiddle() {

        Radio rad = new Radio(30);
        rad.setCurrentRadioChanel(20);

        int expected = 20;
        int actual = rad.getCurrentRadioChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowCustomRadioInTheBorder() {

        Radio rad = new Radio(30);
        rad.setCurrentRadioChanel(29);

        int expected = 29;
        int actual = rad.getCurrentRadioChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowCustomRadioOutTheBorder() {

        Radio rad = new Radio(30);
        rad.setCurrentRadioChanel(30);

        int expected = 0;
        int actual = rad.getCurrentRadioChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowCurrentChanelOutTheBorder() {
        Radio rad = new Radio();

        rad.setCurrentRadioChanel(5);

        int expected = 5;
        int actual = rad.getCurrentRadioChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowCurrentChanelMoreThenNine() {
        Radio rad = new Radio();

        rad.setCurrentRadioChanel(10);

        int expected = 0;
        int actual = rad.getCurrentRadioChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowCurrentChanelLessThenZero() {
        Radio rad = new Radio();

        rad.setCurrentRadioChanel(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowNextChanelInTheMiddle() {
        Radio rad = new Radio();

        rad.setCurrentRadioChanel(8);
        rad.nextRadioChanel();

        int expected = 9;
        int actual = rad.getCurrentRadioChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowNextChanelOnTheBorder() {
        Radio rad = new Radio();

        rad.setCurrentRadioChanel(9);
        rad.nextRadioChanel();

        int expected = 0;
        int actual = rad.getCurrentRadioChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowPrevChanelInTheMiddle() {
        Radio rad = new Radio();

        rad.setCurrentRadioChanel(3);
        rad.prevRadioChanel();

        int expected = 2;
        int actual = rad.getCurrentRadioChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowPrevChanelOnTheBorder() {
        Radio rad = new Radio();

        rad.setCurrentRadioChanel(0);
        rad.prevRadioChanel();

        int expected = 9;
        int actual = rad.getCurrentRadioChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentRadioVolume(50);

        int expected = 50;
        int actual = rad.getCurrentRadioVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowCurrentVolumeMoreThenMaxRadioVolume() {
        Radio rad = new Radio();

        rad.setCurrentRadioVolume(101);

        int expected = 0;
        int actual = rad.getCurrentRadioVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowCurrentVolumeLessThenZero() {
        Radio rad = new Radio();

        rad.setCurrentRadioVolume(-2);

        int expected = 0;
        int actual = rad.getCurrentRadioVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowNextVolumeInTheMiddle() {
        Radio rad = new Radio();

        rad.setCurrentRadioVolume(45);
        rad.increaseVolume();

        int expected = 46;
        int actual = rad.getCurrentRadioVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowNextVolumeOnTheBorder() {
        Radio rad = new Radio();

        rad.setCurrentRadioVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentRadioVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowPrevVolumeInTheMiddle() {
        Radio rad = new Radio();

        rad.setCurrentRadioVolume(22);
        rad.reduceVolume();

        int expected = 21;
        int actual = rad.getCurrentRadioVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowPrevVolumeOnTheBorder() {
        Radio rad = new Radio();

        rad.setCurrentRadioVolume(0);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentRadioVolume();

        assertEquals(expected, actual);
    }
}