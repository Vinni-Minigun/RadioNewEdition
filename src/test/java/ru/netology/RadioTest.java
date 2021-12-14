package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void shouldSetNextChannel() {
        Radio radio = new Radio(6, 9);
        radio.increaseChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    void shouldSetPreviousChannel() {
        Radio radio = new Radio(6, 9);
        radio.decreaseChannel();
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeFromMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void previousChannelFromMin() {
        Radio radio = new Radio(0, 80, 90, 9, 20, 9);
        radio.decreaseChannel();
        assertEquals(90, radio.getCurrentChannel());
    }

    @Test
    public void increaseChannelFromMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void increaseVolumeFromValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(250);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(250);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void increaseChannelFromValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(20);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(20);
        radio.decreaseChannel();
        assertEquals(8, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromMinus() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-20);
        radio.decreaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void decreaseVolumeFromMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}
