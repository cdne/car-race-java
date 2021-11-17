package com.race;

public class Motorcycle implements VehicleProperties {
    private String name;
    private int actualSpeed;
    private static int motorcycleNumber;
    private Weather weather;
    private RandomUtil randomUtil;

    Motorcycle() {
        motorcycleNumber += 1;
        name = "Motorcycle " + motorcycleNumber;
        weather = new Weather();
        randomUtil = new RandomUtil();
        actualSpeed = 100;
    }

    @Override
    public void distanceTraveled() {

    }

    @Override
    public void prepareForLap() {
        actualSpeed = weather.isRaining() ? (actualSpeed - randomUtil.getRandomSpeed(5, 50)) : actualSpeed;
    }

    @Override
    public void moveForAnHour() {

    }

    public String getName() {
        return name;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

}
