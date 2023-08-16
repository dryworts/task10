package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio myradio = new Radio();
    Radio twentyRadio = new Radio(20);

    @Test
    void shouldSetStation() {
        int expected = 0;
        myradio.setCurrentStation(1);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationToNine() {
        int expected = 8;
        myradio.setCurrentStation(9);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationToTen() {
        int expected = 9;
        myradio.setCurrentStation(10);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationToEleven() {
        int expected = 0;
        myradio.setCurrentStation(11);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationToMinusOne() {
        int expected = 0;
        myradio.setCurrentStation(-1);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationToZero() {
        int expected = 0;
        myradio.setCurrentStation(0);
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMoveToNext() {
        int expected = 5;
        myradio.setCurrentStation(5);
        myradio.next();
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetZeroStationAfterIncreaseNine() {
        int expected = 0;
        myradio.setCurrentStation(10);
        myradio.next();
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetNineStationAfterDecreaseZero() {
        int expected = 9;
        myradio.setCurrentStation(0);
        myradio.prev();
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMoveToPrevious() {
        int expected = 6;
        myradio.setCurrentStation(8);
        myradio.prev();
        int actual = myradio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //Тесты на радио с б-О-льшим количеством станций
    @Test
    void shouldCreateTwentyStationAndSetToNineteen() {

        int expected = 19;
        twentyRadio.setCurrentStation(20);
        int actual = twentyRadio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCreateTwentyStationAndSetToTwentyOne() {
        int expected = 0;
        twentyRadio.setCurrentStation(21);
        int actual = twentyRadio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCreateTwentyStationAndSetToMinusOne() {
        int expected = 0;
        twentyRadio.setCurrentStation(-1);
        int actual = twentyRadio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCreateTwentyStationAndMoveToNext() {
        int expected = 5;
        twentyRadio.setCurrentStation(5);
        twentyRadio.next();
        int actual = twentyRadio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCreateTwentyStationAndMoveToPrevious() {
        int expected = 3;
        twentyRadio.setCurrentStation(5);
        twentyRadio.prev();
        int actual = twentyRadio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    // Тесты на громкость
    @Test
    void shouldIncreaseVolume() {
        int expected = 1;
        myradio.increaseVolume();
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        int expected = 0;
        myradio.increaseVolume();
        myradio.decreaseVolume();
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeToFifty() {
        int expected = 50;
        for (int i = 1; i <= 50; i++) {
            myradio.increaseVolume();
        }
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeToHundred() {
        int expected = 100;
        for (int i = 1; i <= 100; i++) {
            myradio.increaseVolume();
        }
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeToHundredAndOne() {
        int expected = 100;
        for (int i = 1; i <= 101; i++) {
            myradio.increaseVolume();
        }
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeToMinusOne() {
        int expected = 0;
        myradio.decreaseVolume();
        int actual = myradio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}


