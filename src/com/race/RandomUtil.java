package com.race;

import java.util.Random;

public class RandomUtil {

    private Random random;

    RandomUtil() {
        random = new Random();
    }

    public int getRandomNumber(int size){
        return random.nextInt(size);
    }

    public int getRandomSpeed(int start, int finish) {
        return random.nextInt(start, finish);
    }
}
