package ru.netologi.radio.radio;

public class Radio {
    private int maxCurrentRadioStationNumber = 9;
    private int minCurrentRadioStationNumber = 0;
    private int currentRadioStationNumber = minCurrentRadioStationNumber;

    public Radio(int maxCurrentRadioStationNumber) {
        this.maxCurrentRadioStationNumber = maxCurrentRadioStationNumber - 1;
    }

    public Radio() {

    }

    private int soundVolume;       //Объем звука

    public int getSoundVolume() {     //Получаем объем звука
        return soundVolume;

    }

    public int setSoundVolume(int SoundVolume) {     //вводим громкости(Меняем громкость)
        soundVolume = SoundVolume;
        if (SoundVolume > 10) {
            setSoundVolume(10);

        }
        if (SoundVolume < 0) {
            soundVolume = 0;
        }


        return this.soundVolume;
    }

    public int increaseVolume() {       //громкость +1
        int currentVolume = setSoundVolume(soundVolume);

        if (currentVolume <= 9) {
            currentVolume = currentVolume + 1;

        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        return setSoundVolume(currentVolume);
    }


    public int downTheVolume() {//Громкость -1
        int currentVolume = setSoundVolume(soundVolume);
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        return setSoundVolume(currentVolume);

    }

    // private int currentRadioStationNumber;                 //текущий канал радио


    public int getCurrentRadioStationNumber() {           //получаем канал
        return currentRadioStationNumber;
    }

    public int setCurrentRadioStationNumber(int currentRadioStationNumber) {     //вводим канал
        if (currentRadioStationNumber > maxCurrentRadioStationNumber) {
            currentRadioStationNumber = maxCurrentRadioStationNumber;
        }
        if (currentRadioStationNumber < minCurrentRadioStationNumber) {
            currentRadioStationNumber = 0;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
        return this.currentRadioStationNumber;
    }

    public int switchtheNextStation() {        //следующий канал +1
        int currentStation = currentRadioStationNumber;
        currentStation = currentStation + 1;
        if (currentStation > maxCurrentRadioStationNumber) {
            currentStation = 0;
        }

        return currentStation;

    }

    public int switchingThePreviousStation() {       //предыдущий канал -1
        int currentStation = currentRadioStationNumber;
        currentStation = currentStation - 1;
        if (currentStation < 0) {
            currentStation = maxCurrentRadioStationNumber;
        }
        return currentStation;

    }


}




