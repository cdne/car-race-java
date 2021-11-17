package com.race;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car implements VehicleProperties{
    private List<String> listOfNames;
    private String name;
    private int normalSpeed;
    private int actualSpeed;
    private RandomUtil randomUtil;
    private boolean yellowFlag;

    public Car() {
        randomUtil = new RandomUtil();
        listOfNames = new ArrayList<String>(List.of(new String[] {"Dynamics",
                "Union",
                "Nimbus",
                "Renegade",
                "Centaur",
                "Moonlight",
                "Aeon",
                "Mythic",
                "Vertex"}));
        setName();
        normalSpeed = randomUtil.getRandomSpeed(80, 110);
    }

    @Override
    public void distanceTraveled() {

    }

    @Override
    public void prepareForLap() {
        actualSpeed = yellowFlag ? 75 : normalSpeed;
    }

    @Override
    public void moveForAnHour() {

    }

    public void setYellowFlag(boolean yellowFlag) {
        this.yellowFlag = yellowFlag;
    }

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    private void setName() {
        int firstNumber = randomUtil.getRandomNumber(listOfNames.size());
        int secondNumber = randomUtil.getRandomNumber(listOfNames.size());
        name = listOfNames.get(firstNumber) + " " + listOfNames.get(secondNumber);
    }

    public String getName() {
        return name;
    }
}
