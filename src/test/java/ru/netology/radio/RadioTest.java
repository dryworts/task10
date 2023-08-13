package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void shouldSetStation() {
        Radio myradio = new Radio();
        int expected = 5;
        myradio.setCurrentStation(5);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationToTen() {
        Radio myradio = new Radio();
        int expected = 0;
        myradio.setCurrentStation(10);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationToMinusOne() {
        Radio myradio = new Radio();
        int expected = 0;
        myradio.setCurrentStation(-1);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationToNine() {
        Radio myradio = new Radio();
        int expected = 9;
        myradio.setCurrentStation(9);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationToZero() {
        Radio myradio = new Radio();
        int expected = 0;
        myradio.setCurrentStation(0);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMoveToNext() {
        Radio myradio = new Radio();
        int expected = 6;
        myradio.setCurrentStation(5);
        myradio.next();
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetZeroStationAfterIncreaseNine() {
        Radio myradio = new Radio();
        int expected = 0;
        myradio.setCurrentStation(9);
        myradio.next();
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetNineStationAfterDecreaseZero() {
        Radio myradio = new Radio();
        int expected = 9;
        myradio.setCurrentStation(0);
        myradio.prev();
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMoveToPrevious() {
        Radio myradio = new Radio();
        int expected = 7;
        myradio.setCurrentStation(8);
        myradio.prev();
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio myradio = new Radio();
        int expected = 1;
        myradio.increaseVolume();
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio myradio = new Radio();
        int expected = 0;
        myradio.increaseVolume();
        myradio.decreaseVolume();
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeToFifty() {
        Radio myradio = new Radio();
        int expected = 50;
        for (int i = 1; i <= 50; i++) {
            myradio.increaseVolume();
        }
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeToHundred() {
        Radio myradio = new Radio();
        int expected = 100;
        for (int i = 1; i <= 100; i++) {
            myradio.increaseVolume();
        }
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeToHundredAndOne() {
        Radio myradio = new Radio();
        int expected = 100;
        for (int i = 1; i <= 101; i++) {
            myradio.increaseVolume();
        }
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeToMinusOne() {
        Radio myradio = new Radio();
        int expected = 0;
        myradio.decreaseVolume();
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}


