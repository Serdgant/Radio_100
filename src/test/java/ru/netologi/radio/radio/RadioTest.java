package ru.netologi.radio.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    void shoudGetSoundVolume() {                  //вводим звук
        Radio rad = new Radio();
        rad.setSoundVolume(-8);
        int expected = 0;
        int actual = rad.getSoundVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shoudGetSoundVolumeExceeding() {              //вводим звук превышение
        Radio rad = new Radio();
        rad.setSoundVolume(15);
        int expected = 10;
        int actual = rad.getSoundVolume();
        assertEquals(expected, actual);

    }


    @Test
    void shoudIncreaseVolume() {                     //громкость +1
        Radio rad =  new Radio();
        int currentVolume = 8;
        int expected = 9;
        int actual = rad.increaseVolume(currentVolume);
        assertEquals(expected, actual);


    }

    @Test
    void shoudIncreaseVolumExceeding() {              //Громкость +1 превышение
        Radio rad = new Radio();
        int currentVolume = +15;
        int expected = 10;
        int actual = rad.increaseVolume(currentVolume);
        assertEquals(expected, actual);
    }


    @Test
    void shoudDownTheVolume() {                   //громкость -1
        Radio rad = new Radio();
        int currentVolume = 8;
        int expected = 7;
        int actual = rad.downTheVolume(currentVolume);
        assertEquals(expected, actual);
    }

    @Test
    void shoudDownTheVolumeZero() {             // громкость -1 (0)
        Radio rad = new Radio();
        int currentVolume = -5;
        int expected = 0;
        int actual = rad.downTheVolume(currentVolume);
        assertEquals(expected, actual);


    }


    @Test
    void shoudGetCurrentRadioStationNumber() {                   //вводим канал
        Radio rad=new Radio();
        rad.setCurrentRadioStationNumber(7);
        int expected=7;
        int actual= rad.getCurrentRadioStationNumber();
        assertEquals(expected,actual);
    }
    @Test
    void shoudGetCurrentRadioStationNumberExceeding() {           //вводим канал превышение
        Radio rad=new Radio();
        rad.setCurrentRadioStationNumber(10);
        int expected=0;
        int actual= rad.getCurrentRadioStationNumber();
        assertEquals(expected,actual);
    }

    @Test
    void shoudSwitchtheNextStation() {                 //Следущий канал +1
        Radio rad=new Radio();
        int currentStation =8;
        int expected=9;
        int actual=rad.switchtheNextStation(currentStation);
        assertEquals(expected,actual);
    }

    @Test
    void shoudSwitchingThePreviousStation() {                        //предыдущий канал -1
        Radio rad =new Radio();
        int currentStation=9;
        int expected=8;
        int actual=rad.switchingThePreviousStation(currentStation);
        assertEquals(expected,actual);
    }
}