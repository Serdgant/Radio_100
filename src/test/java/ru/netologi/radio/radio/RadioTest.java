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
        Radio rad = new Radio();
        rad.setSoundVolume(15);

        int expected = 10;
        int actual = rad.increaseVolume();
        assertEquals(expected, actual);


    }

    @Test
    void shoudIncreaseVolumExceeding() {              //Громкость +1 превышение
        Radio rad = new Radio();
        rad.setSoundVolume(0);
        int expected = 1;
        int actual = rad.increaseVolume();
        assertEquals(expected, actual);
    }


    @Test
    void shoudDownTheVolume() {                   //громкость -1
        Radio rad = new Radio();
        rad.setSoundVolume(8);
        int expected = 7;
        int actual = rad.downTheVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shoudDownTheVolumeZero() {             // громкость -1 (0)
        Radio rad = new Radio();
        rad.setSoundVolume(-5);
        int expected = 0;
        int actual = rad.downTheVolume();
        assertEquals(expected, actual);


    }


    @Test
    void shoudGetCurrentRadioStationNumber() {                   //вводим канал
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(7);
        int expected = 7;
        int actual = rad.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shoudGetCurrentRadioStationNumberExceeding() {           //вводим канал превышение
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(10);
        int expected = 9;
        int actual = rad.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shoudGetCurrentRadioStationNumberExceedingZero() {           //вводим -6
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(-6);
        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }


    @Test
    void shoudSwitchtheNextStation() {                 //Следущий канал +1
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(0);
        int expected = 1;
        int actual = rad.switchtheNextStation();
        assertEquals(expected, actual);
    }

    @Test
    void shoudSwitchtheNextStationZero() {                 //Следущий канал +1 (Ноль)
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(9);
        int expected = 0;
        int actual = rad.switchtheNextStation();
        assertEquals(expected, actual);
    }

    @Test
    void shoudSwitchtheNextStationMinus() {                 //Следущий канал  +1 (-7)
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(-7);
        int expected = 1;
        int actual = rad.switchtheNextStation();
        assertEquals(expected, actual);
    }

    @Test
    void shoudSwitchingThePreviousStationTwo() {                        //следующий канал +1(превышение)
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = rad.switchtheNextStation();
        assertEquals(expected, actual);
    }


    @Test
    void shoudSwitchingThePreviousStationZero() {                        //предыдущий канал -1 ноль
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(0);
        int expected = 9;
        int actual = rad.switchingThePreviousStation();
        assertEquals(expected, actual);
    }

    @Test
    void shoudSwitchingThePreviousStationAvereng() {                        //предыдущий канал -1 (среднее)
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(9);
        int expected = 8;
        int actual = rad.switchingThePreviousStation();
        assertEquals(expected, actual);
    }


    @Test
    void shoudSwitchingThePreviousStation() {            // предыдущий канал -1  ноль
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(1);
        int expected = 0;
        int actual = rad.switchingThePreviousStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchingThePreviousStationMinus() {                 //предыдущий канал -1(-3)
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(-3);
        int expected = 9;
        int actual = rad.switchingThePreviousStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchingThePreviousStationMinuss() {                 //предыдущий канал -1(-3)
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(15);
        int expected = 8;
        int actual = rad.switchingThePreviousStation();
        assertEquals(expected, actual);
    }


}