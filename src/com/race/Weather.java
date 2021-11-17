package com.race;

public class Weather {

    private static final int CHANCE_TO_RAIN = 30;
    private boolean isRaining = false;
    private RandomUtil randomUtil;
    
    Weather(){
        randomUtil = new RandomUtil();
        advance();
    }

    public void advance() {
        isRaining = randomUtil.getRandomNumber(100) < CHANCE_TO_RAIN;
    }

    public boolean isRaining() {
        return isRaining;
    }
}
