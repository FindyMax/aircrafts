package com.example.aircrafts;

public class Plane implements Aircraft{
    private int capacity;
    private int speed;
    private int fuelConsumptionPerHour;

    public Plane(int capacity, int speed, int fuelConsumptionPerHour) {
        this.capacity = capacity;
        this.speed = speed;
        this.fuelConsumptionPerHour = fuelConsumptionPerHour;
    }

    @Override
    public int fuelConsumption(int distance) {
        return fuelConsumptionPerHour * (distance / speed);
    }
    @Override
    public float airTime(int distance) {
        return distance / speed;
    }
}
