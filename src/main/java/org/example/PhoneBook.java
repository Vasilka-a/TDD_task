package org.example;

import java.util.TreeMap;

public class PhoneBook {
    static TreeMap<String, Long> phoneBookMap = new TreeMap<>();
    public static int add(String name, long number ) {
        if (phoneBookMap.containsKey(name)) {
            throw new IllegalArgumentException("Данное имя уже существует, введите другое имя");
        } else {
            phoneBookMap.put(name, number);
        }
        return phoneBookMap.size();
    }



}
