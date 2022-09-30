package com.bridgelabz;

public class InvoiceGenerator {
    private final double COST_PER_KILOMETER = 10.0;
    private final int COST_PER_MINUTE = 1;
    private final int MINIMUM_FARE = 5;

    public double calculateFare(double distance,int time){
        double fare = (distance * COST_PER_KILOMETER) + (time * COST_PER_MINUTE);
        return Math.max(MINIMUM_FARE,fare);
    }
}
