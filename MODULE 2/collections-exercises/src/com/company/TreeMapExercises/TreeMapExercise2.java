package com.company.TreeMapExercises;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExercise2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "content4");
        map.put(2, "content1");
        map.put(3, "content3");
        map.put(4, "content2");

        Map<Integer, String> anotherMap = new TreeMap<>();

        for(int key: map.keySet()) {
            anotherMap.put(key, map.get(key));
        }

        System.out.println("map: "+map);
        System.out.println("anotherMap: "+anotherMap);
    }

}
