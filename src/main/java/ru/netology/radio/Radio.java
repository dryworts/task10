package ru.netology.radio;

public class Radio {
    int currentStation;
    int currentVolume;
    int quantityOfStations;

    //=================================

    //конструктор
    public Radio() {
        quantityOfStations = 10;
    }

    //перезагрузка
    public Radio(int newQuantityOfStations) {
        this.quantityOfStations = newQuantityOfStations;
    }


    //==================================
    //геттры
    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    //=================================
    //сеттеры

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 0 && newCurrentStation <= quantityOfStations) {
            currentStation = newCurrentStation - 1;
        }
    }

    public int next() {
        if (currentStation == quantityOfStations - 1) {
            currentStation = 0;

        } else {
            currentStation += 1;
        }

        return currentStation;
    }

    public int prev() {
        if (currentStation == 0) {
            currentStation = quantityOfStations - 1;
        } else {
            currentStation -= 1;
        }
        return currentStation;
    }

    /*
        public void setCurrentVolume(int newCurrentVolume) {

            currentVolume = newCurrentVolume;
        }
    */
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
