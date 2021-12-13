package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void increaseChannal() {
        Radio radio = new Radio();
        radio.setCurrentChannal(5);
        radio.increaseChannel();
        assertEquals(6, radio.getCurrentChannal());
    }

    @Test
    void decreaseChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannal(6);
        radio.decreaseChannel();
        assertEquals(5, radio.getCurrentChannal());
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
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
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
        Radio radio = new Radio();
        radio.setCurrentChannal(0);
        radio.decreaseChannel();
        assertEquals(9, radio.getCurrentChannal());
    }

    @Test
    public void increaseChannelFromMax() {
        Radio radio = new Radio();
        radio.setCurrentChannal(9);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannal());
    }

    @Test
    public void increaseVolumeFromValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(25);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(25);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void increaseChannelFromValue() {
        Radio radio = new Radio();
        radio.setCurrentChannal(20);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannal());
    }

    @Test
    public void previousChannelFromValue() {
        Radio radio = new Radio();
        radio.setCurrentChannal(20);
        radio.decreaseChannel();
        assertEquals(8, radio.getCurrentChannal());
    }

    @Test
    public void previousChannelFromMinus() {
        Radio radio = new Radio();
        radio.setCurrentChannal(-20);
        radio.decreaseChannel();
        assertEquals(9, radio.getCurrentChannal());
    }

    @Test
    public void decreaseVolumeFromMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}
