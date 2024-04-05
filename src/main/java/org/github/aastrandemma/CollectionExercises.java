package org.github.aastrandemma;

import java.util.*;

public class CollectionExercises {
    public static void main(String[] args) {
        // exercise1();
        // exercise2();
        // exercise3();
        // exercise4();
        // exercise5();
        // exercise6();
        // exercise7();
        // exercise8();
        // exercise9();
        // exercise10();
        // exercise11();
        exercise12();
    }

    public static void exercise1() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println(weekDays);
    }

    public static void exercise2() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        for (String day : weekDays) {
            System.out.println(day);
        }
    }

    public static void exercise3() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        weekDays.add(3, "Thursday");

        System.out.println(weekDays);
    }

    public static void exercise4() {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        List<String> firstDaysOfTheWeek = weekDays.subList(0, 3);
        System.out.println(firstDaysOfTheWeek);
    }

    public static void exercise5() {
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println(weekDays);
    }

    public static void exercise6() {
        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        ArrayList<String> weekDaysAL = new ArrayList<>(weekDays);
        System.out.println(weekDaysAL);
    }

    public static void exercise7() {
        HashSet<String> names = new HashSet<>();
        names.add("Emma");
        names.add("Josefin");
        names.add("Anna");
        names.add("Sofia");
        names.add("Berit");

        ArrayList<String> namesToAL = new ArrayList<>(names);

        Collections.sort(namesToAL);
        System.out.println(namesToAL);
    }

    public static void exercise8() {
        HashSet<String> names = new HashSet<>();
        names.add("Emma");
        names.add("Josefin");
        names.add("Anna");
        names.add("Sofia");
        names.add("Berit");

        TreeSet<String> ascendingNames = new TreeSet<>(names);
        System.out.println(ascendingNames);
    }

    public static void exercise9() {
        HashMap<Integer, String> carStorage = new HashMap<>();
        carStorage.put(1, "Volvo");
        carStorage.put(2, "Mercedes");
        carStorage.put(3, "Nissan");

        System.out.println(carStorage);
    }

    public static void exercise10() {
        HashMap<Integer, String> carStorage = new HashMap<>();
        carStorage.put(1, "Volvo");
        carStorage.put(2, "Mercedes");
        carStorage.put(3, "Nissan");

        for (Map.Entry<Integer, String> entry : carStorage.entrySet()) {
            System.out.println("Key: " + entry.getKey());
        }
    }

    public static void exercise11() {
        HashMap<Integer, String> carStorage = new HashMap<>();
        carStorage.put(1, "Volvo");
        carStorage.put(2, "Mercedes");
        carStorage.put(3, "Nissan");

        for (Map.Entry<Integer, String> entry : carStorage.entrySet()) {
            System.out.println("Brand: " + entry.getValue());
        }
    }

    public static void exercise12() {
        Car volvo = new Car(1, "Volvo", "V70");
        Car mercedes = new Car(2, "Mercedes", "C63 AMG");
        Car nissan = new Car(3, "Nissan", "Frontier");

        HashMap<Integer, Car> carStorage = new HashMap<>();
        carStorage.put(1, volvo);
        carStorage.put(20, mercedes);
        carStorage.put(50, nissan);

        for (Map.Entry<Integer, Car> entry : carStorage.entrySet()) {
            System.out.println("Brand: " + entry.getValue().getBrand());
        }

    }
}