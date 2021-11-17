package com.race;

public class Main {

    public static void main(String[] args) {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();
        truck1.prepareForLap();

        System.out.println(truck1.getActualSpeed());
        truck2.prepareForLap();

        System.out.println(truck2.getActualSpeed());
        truck3.prepareForLap();

        System.out.println(truck3.getActualSpeed());

    }
}
