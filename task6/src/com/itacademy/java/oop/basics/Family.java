package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class Family {
    private Person[] familyMembers;
    private Vehicle vehicle;
    private TravelDestination travelDestination;

    public Family(Person[] familyMembers, Vehicle vehicle, TravelDestination travelDestination) {
        this.familyMembers = familyMembers;
        this.vehicle = vehicle;
        this.travelDestination = travelDestination;
    }

    public void setTravelDestination(TravelDestination travelDestination) {
        this.travelDestination = travelDestination;
    }

    public Person[] getFamilyMembers() {
        return familyMembers;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public TravelDestination getTravelDestination() {
        return travelDestination;
    }

    @Override
    public String toString() {
        return "Family{" +
                "familyMembers=" + Arrays.toString(familyMembers) +
                ", vehicle=" + vehicle +
                ", travelDestination=" + travelDestination +
                '}';
    }
}
