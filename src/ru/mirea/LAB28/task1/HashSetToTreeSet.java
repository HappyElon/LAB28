package ru.mirea.LAB28.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("value3");
        hashSet.add("value1");
        hashSet.add("value2");

        System.out.println("HashSet: " + hashSet);

        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet: " + treeSet);
    }
}

