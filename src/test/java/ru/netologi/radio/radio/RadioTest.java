package ru.netologi.radio.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    void getSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(-8);
        int expected = 0;
        int actual = rad.getSoundVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shoudIncreaseVolume() {                     //громкость +1
        Radio rad =new Radio();
        int currentVolume=8;
        int expected =9;
        int actual = rad.increaseVolume(currentVolume);
        assertEquals(expected,actual);



    }



    @Test
    void shoudDownTheVolume() {                   //громкость -1
        Radio rad =new Radio();
        int currentVolume= 8;
        int expected=7;
        int actual =rad.downTheVolume(currentVolume);
        assertEquals(expected,actual);
    }
}