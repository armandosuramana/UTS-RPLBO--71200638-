package com.rplbo;

public class Transmision {
    private String transType;
    private int numSpeed;
    public int getNumSpeed();
    public String getTransType();
    public void setNumSpeed(int);
    public void setTransType(String);

    public void setNumSpeed(int numSpeed) {
        this.numSpeed = numSpeed;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }
}
