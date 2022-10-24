package com.rplbo;

public class MotorVehicle {
    private String vehicleName;
    private Engine engine;
    private Tire tire;
    private Wheel wheel;
    private Transmition transmition;

    public Engine getEngine() {
        return engine;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public Tire getTire() {
        return tire;
    }

    public Transmition getTransmition() {
        return transmition;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setTransmition(Transmition transmition) {
        this.transmition = transmition;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
