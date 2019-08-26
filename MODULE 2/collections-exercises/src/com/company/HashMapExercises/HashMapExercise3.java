package com.company.HashMapExercises;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExercise3 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "content1");
        map.put(2, "content2");
        map.put(3, "content3");

        Map<Integer, String> anotherMap = new HashMap<>();

        for(int key: map.keySet()) {
            anotherMap.put(key, map.get(key));
        }

        System.out.println("map: "+map);
        System.out.println("anotherMap: "+anotherMap);


    }

}
