package ru.netology;

public class Radio {
    private int minChannel = 0;
    private int maxChannel = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentChannel;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public Radio(int currentChannel, int maxChannel) {
        this.currentChannel = currentChannel;
        this.maxChannel = maxChannel;
    }

    public Radio(int maxVolume, int minVolume, int maxChannel, int minChannel, int currentVolume, int currentChannel) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxChannel = maxChannel;
        this.minChannel = minChannel;
        this.currentVolume = currentVolume;
        this.currentChannel = currentChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannal(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannal(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void increaseChannel() {
        if (currentChannel == maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
        currentChannel++;
    }

    public void decreaseChannel() {
        if (currentChannel == minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        currentChannel--;
    }
}
