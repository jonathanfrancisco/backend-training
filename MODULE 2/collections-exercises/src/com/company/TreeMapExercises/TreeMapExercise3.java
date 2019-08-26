package com.company.TreeMapExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExercise3 {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "content4");
        map.put(2, "content1");
        map.put(3, "content3");
        map.put(4, "content2");

        Scanner scanner = new Scanner(System.in);
        System.out.println(map);

        System.out.print("Enter key to search: ");
        int key = scanner.nextInt();

        if(!map.containsKey(key)) {
            System.out.println("map does not contain a key of "+key);
        } else {
            System.out.println("map contains a key of "+key);
        }

    }
}
