package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTests {

    @Test
    public void shouldSnowCurrentChanel() {
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

        rad.setCurrentRadioChanel(6);
        rad.nextRadioChanel();

        int expected = 7;
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

        rad.setCurrentRadioVolume(5);

        int expected = 5;
        int actual = rad.getCurrentRadioVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowCurrentVolumeMoreThenTen() {
        Radio rad = new Radio();

        rad.setCurrentRadioVolume(11);

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

        rad.setCurrentRadioVolume(6);
        rad.increaseVolume();

        int expected = 7;
        int actual = rad.getCurrentRadioVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowNextVolumeOnTheBorder() {
        Radio rad = new Radio();

        rad.setCurrentRadioVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentRadioVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSnowPrevVolumeInTheMiddle() {
        Radio rad = new Radio();

        rad.setCurrentRadioVolume(8);
        rad.reduceVolume();

        int expected = 7;
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