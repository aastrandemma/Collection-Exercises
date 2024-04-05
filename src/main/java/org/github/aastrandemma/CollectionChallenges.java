package org.github.aastrandemma;

import java.util.*;

public class CollectionChallenges {
    public static void main(String[] args) {
        // challenge1();
        // challenge2();
        // challenge3();
        challenge4();
    }

    public static void challenge1() {
        Set<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        Set<String> daysOfWeekend = new HashSet<>();
        daysOfWeekend.add("Saturday");
        daysOfWeekend.add("Sunday");

        daysOfWeek.retainAll(daysOfWeekend);
        System.out.println(daysOfWeekend);
    }

    public static void challenge2() {
        HashMap<String, String> contact = new HashMap<>();
        contact.put("emma@test.se", "Emma");
        contact.put("anna@test.se", "Anna");
        contact.put("josefin@test.se", "Josefin");

        Set<String> email = contact.keySet();
        System.out.println(email);
    }

    public static void challenge3() {
        SuperHero captainAmerica = new SuperHero(1, "Captain America", 102);
        SuperHero ironMan = new SuperHero(2, "Iron Man", 54);
        SuperHero wolverine = new SuperHero(3, "Wolverine", 197);

        List<SuperHero> superheroes = new ArrayList<>();
        superheroes.add(captainAmerica);
        superheroes.add(ironMan);
        superheroes.add(wolverine);

        Collections.sort(superheroes);

        for (SuperHero superHero : superheroes) {
            System.out.println(superHero.getName() + " is " + superHero.getAge() + " years old.");
        }
    }

    public static void challenge4() {
        int[] numbers = {1, 4, 4, 2, 6, 7};
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println(uniqueNumbers);
    }
}