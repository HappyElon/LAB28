package ru.mirea.LAB28.task2_needs_fix;

import java.util.HashMap;
import java.util.Map;

public class NameMap {
    public static void main(String[] args) {
        Map<Person, Integer> nameMap = createMap();

        int sameFirstNameCount = getSameFirstNameCount(nameMap);
        int sameLastNameCount = getSameLastNameCount(nameMap);

        System.out.println("Количество людей с одинаковыми именами: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковыми фамилиями: " + sameLastNameCount);
    }

    public static Map<Person, Integer> createMap() {
        Map<Person, Integer> nameMap = new HashMap<>();
        nameMap.put(new Person("Mitchell", "Benjamin"), 1);
        nameMap.put(new Person("Turner", "Olivia"), 1);
        nameMap.put(new Person("Anderson", "Ethan"), 1);
        nameMap.put(new Person("Reynolds", "Sophia"), 1);
        nameMap.put(new Person("Cooper", "Mason"), 1);
        nameMap.put(new Person("Cooper", "Ava"), 1);
        nameMap.put(new Person("Carter", "Liam"), 1);
        nameMap.put(new Person("Morgan", "Olivia"), 1);
        nameMap.put(new Person("Hayes", "Jackson"), 1);
        nameMap.put(new Person("Foster", "Emma"), 1);

        return nameMap;
    }

    public static int getSameFirstNameCount(Map<Person, Integer> nameMap) {
        return countSameValues(nameMap, p -> p.firstName);
    }

    public static int getSameLastNameCount(Map<Person, Integer> nameMap) {
        return countSameValues(nameMap, p -> p.lastName);
    }

    private static int countSameValues(Map<Person, Integer> nameMap, java.util.function.Function<Person, String> extractor) {
        Map<String, Integer> valueCountMap = new HashMap<>();

        for (Person person : nameMap.keySet()) {
            String value = extractor.apply(person);
            valueCountMap.compute(value, (k, v) -> v == null ? 1 : v + 1);
        }

        int count = 0;
        for (int valueCount : valueCountMap.values()) {
            if (valueCount > 1) {
                count += valueCount - 1;
            }
        }

        return count;
    }
}


