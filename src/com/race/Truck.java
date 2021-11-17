package com.race;

public class Truck implements VehicleProperties {
    private String name;
    private boolean isBroken;
    private int actualSpeed;
    private RandomUtil randomUtil;
    private static final int CHANCE_TO_BRAKE = 5;

    Truck() {
        randomUtil = new RandomUtil();
        name = String.valueOf(randomUtil.getRandomSpeed(0, 1000));
        actualSpeed = 100;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    private void setIsBroken(){
        isBroken = randomUtil.getRandomNumber(100) < CHANCE_TO_BRAKE;
        System.out.println(randomUtil.getRandomNumber(100) < CHANCE_TO_BRAKE);
    }

    @Override
    public void distanceTraveled() {

    }

    @Override
    public void prepareForLap() {
        setIsBroken();
        actualSpeed = isBroken ? 0 : actualSpeed;
    }

    @Override
    public void moveForAnHour() {

    }
}
