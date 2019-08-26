package com.company.TreeMapExercises;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExercise5 {
    public static void main(String[] args) {


        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "content4");
        map.put(2, "content1");
        map.put(3, "content3");


        System.out.println("All keys of the map: "+map.keySet());


    }
}
