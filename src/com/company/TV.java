package com.company;

public class TV {
    private int channel;
    private int volumeLevel;
    private boolean power;

    public TV(int channel, int volumeLevel) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.power = false;
    }

    public TV() {
    }

    public void turnOnOrOffTheTv() {
        if (!this.power) {
            this.power = true;
        } else if (this.power) {
            this.power = false;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower() {
        this.power = false;
    }
}
