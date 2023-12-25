package ru.mirea.LAB28.task3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        hashTable.put(2.5, "Value1");
        hashTable.put(5.7, "Value2");
        hashTable.put(8.3, "Value3");

        System.out.println("Value for key 2.5: " + hashTable.get(2.5));
        System.out.println("Value for key 5.7: " + hashTable.get(5.7));
        System.out.println("Value for key 8.3: " + hashTable.get(8.3));
        System.out.println("Value for key 10.1: " + hashTable.get(10.1));
    }
}

