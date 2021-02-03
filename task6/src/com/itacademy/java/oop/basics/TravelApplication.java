package com.itacademy.java.oop.basics;

public class TravelApplication {

    public static void main(String[] args) {

        //----First family----
        Person motherFamilyOne = new Person("Judy", "Adams", Gender.FEMALE, 46);
        Person fatherFamilyOne = new Person("Garry", "Adams", Gender.MALE, 44);
        Person child1FamilyOne = new Person("Tom", "Adams", Gender.MALE, 18);
        Person child2FamilyOne = new Person("Paul", "Adams", Gender.MALE, 14);

        Vehicle vehicleFamilyOne = new Vehicle("Yaris", "Toyota", 9, 10);
        TravelDestination travelDestinationFamilyOne = new TravelDestination("Seaside", "Palanga", 110);

        Person[] arrayFamilyOne = {motherFamilyOne, fatherFamilyOne, child1FamilyOne, child2FamilyOne};
        Family firstFamily = new Family(arrayFamilyOne, vehicleFamilyOne, travelDestinationFamilyOne);

        //----Second family----
        Person motherFamilyTwo = new Person("Jasmin", "Grey", Gender.FEMALE, 30);
        Person fatherFamilyTwo = new Person("William", "Grey", Gender.MALE, 36);
        Person child1FamilyTwo = new Person("Susan", "Grey", Gender.FEMALE, 8);

        Vehicle vehicleFamilyTwo = new Vehicle("benz", "mercedes", 15, 12);
        TravelDestination travelDestinationFamilyTwo = new TravelDestination("Gediminas tower", "Vilnius", 30);

        Person[] arrayFamilyTwo = {motherFamilyTwo, fatherFamilyTwo, child1FamilyTwo};
        Family secondFamily = new Family(arrayFamilyTwo, vehicleFamilyTwo, travelDestinationFamilyTwo);


        TravelManager.travel(firstFamily);
        TravelManager.travel(secondFamily);

        TravelManager.changeDestination(firstFamily, new TravelDestination("Hotel", "Klaipeda", 80));
        TravelManager.travel(firstFamily);

        TravelManager.printFamilyMembers(firstFamily);

    }

}
