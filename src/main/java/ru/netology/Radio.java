package ru.netology;

public class Radio {
    private int minChannal = 0;
    private int maxChannal = 9;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentChannal;
    private int currentVolume;

    public int getMinChannal() {
        return minChannal;
    }

    public void setMinChannal(int minChannal) {
        this.minChannal = minChannal;
    }

    public int getMaxChannal() {
        return maxChannal;
    }

    public void setMaxChannal(int maxChannal) {
        this.maxChannal = maxChannal;
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

    public int getCurrentChannal() {
        return currentChannal;
    }

    public void setCurrentChannal(int currentChannal) {
        if (currentChannal > maxChannal) {
            this.currentChannal = maxChannal;
            return;
        }
        if (currentChannal < minChannal) {
            this.currentChannal = minChannal;
            return;
        }
        this.currentChannal = currentChannal;
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
        if (currentChannal == maxChannal) {
            this.currentChannal = minChannal;
            return;
        }
        currentChannal++;
    }

    public void decreaseChannel() {
        if (currentChannal == minChannal) {
            this.currentChannal = maxChannal;
            return;
        }
        currentChannal--;
    }
}
