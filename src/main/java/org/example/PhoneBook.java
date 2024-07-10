package org.example;

import java.util.Map;
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

    public static String findByNumber (long number) {
        String name = null;

        for (Map.Entry<String, Long> entry : phoneBookMap.entrySet()) {
            if (entry.getValue().equals(number)) {
                name = entry.getKey();
                break;
            }
        }
        return name;
    }

    public static long findByName (String name) {
        return 0;
    }



}
