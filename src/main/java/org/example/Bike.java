package org.example;

public class Bike{
    private final WheelManager wheels;
    public Bike() {
        wheels = new WheelManager();
    }
    public Integer getWheels(){
        return wheels.getWheels();
    }
}