package com.example.aircrafts;

public class Helicopter implements Aircraft{
    private int capacity;
    private int speed;
    private int fuelConsumptionPer100km;

    public Helicopter(int capacity, int speed, int fuelConsumptionPer100km) {
        this.capacity = capacity;
        this.speed = speed;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }

    @Override
    public int fuelConsumption(int distance) {
        return fuelConsumptionPer100km * distance / 100;
    }
    @Override
    public float airTime(int distance) {
        return distance / speed;
    }
}
