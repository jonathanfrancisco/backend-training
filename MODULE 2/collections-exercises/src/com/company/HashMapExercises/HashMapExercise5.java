package com.company.HashMapExercises;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise5 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "content1");
        map.put(2, "content2");
        map.put(3, "content3");
        map.put(4, "content4");

        if(!map.isEmpty()) {
            System.out.println("Map is not empty.");
        } else {
            System.out.println("Map is empty :(");
        }

    }

}
