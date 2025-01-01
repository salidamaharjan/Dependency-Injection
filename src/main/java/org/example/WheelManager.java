package org.example;

public class WheelManager {
    private final Wheels wheels;
    public WheelManager() {
        wheels = new Wheels(3);
    }
    public void setWheels(Integer numOfWheel) {
        this.wheels.setNumOfWheel(numOfWheel);
    }
    public Integer getWheels() {
        return this.wheels.getNumOfWheel();
    }
}
