package ru.netologi.radio.radio;

public class Radio {
    private int soundVolume;       //Объем звука

    public int getSoundVolume() {     //Получаем объем звука
        return soundVolume;

    }

    public int setSoundVolume(int newSoundVolume) {     //вводим громкости(Меняем громкость)
        soundVolume = newSoundVolume;
        if (newSoundVolume > 10) {
            setSoundVolume(10);

        }
        if (newSoundVolume < 0) {
            soundVolume = 0;
        }


        return newSoundVolume;
    }

    public int increaseVolume(int currentVolume) {             //Громкость +1
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;

        }
        if (currentVolume >=10){
            currentVolume=10;
        }
        return currentVolume;
    }

    public int downTheVolume( int currentVolume) {//Громкость -1

        if (currentVolume > 0) {
            currentVolume = currentVolume -1;


        }
        if (currentVolume <= 0){
            currentVolume=0;
        }


        return currentVolume;


    }
}







