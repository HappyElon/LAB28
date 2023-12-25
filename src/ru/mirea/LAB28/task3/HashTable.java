package ru.mirea.LAB28.task3;

import java.util.LinkedList;

class HashTable {
    private int size;
    private LinkedList<HashNode>[] table;

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(double key) {
        return (int) (key % size);
    }

    public void put(double key, String value) {
        int index = hash(key);
        LinkedList<HashNode> list = table[index];

        for (HashNode node : list) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }

        list.add(new HashNode(key, value));
    }

    public String get(double key) {
        int index = hash(key);
        LinkedList<HashNode> list = table[index];

        for (HashNode node : list) {
            if (node.key == key) {
                return node.value;
            }
        }

        return null;
    }
}
