package com.itacademy.java.oop.basics;

public class TravelManager {
    public static void changeDestination(Family family, TravelDestination destination) {
        if (family.getTravelDestination() != destination) {
            family.setTravelDestination(destination);
        }
    }

    public static void travel(Family family) {
        double fuel = family.getVehicle().getFuel();
        double consumption = family.getVehicle().getConsumption();
        double distance = family.getTravelDestination().getDistance();
        if (canReachDestination(fuel, consumption, distance)) {
            System.out.println("Family was able to travel to their destination.");
        } else {
            System.out.println("Family was not able to travel to their destination :'( . " +
                    "Vehicle needs " + amountOfFuelNeeded(fuel, consumption, distance) + " liters " +
                    "of fuel.");
        }
    }

    private static boolean canReachDestination(double fuel, double consumption, double distance) {
        double reachableDistance = (fuel * 100) / consumption;
        return distance <= reachableDistance;
    }

    private static double amountOfFuelNeeded(double fuel, double consumption, double distance) {
        double reachableDistance = (fuel * distance) / consumption;
        double extraDistance = distance - reachableDistance;
        return (extraDistance * consumption) / 100;
    }

    public static void printFamilyMembers(Family family) {
        for (Person member : family.getFamilyMembers()) {
            System.out.println(member.toString());
        }
    }
}
