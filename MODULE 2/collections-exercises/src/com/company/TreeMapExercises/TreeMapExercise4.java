package com.company.TreeMapExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExercise4 {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "content4");
        map.put(2, "content1");
        map.put(3, "content3");
        map.put(4, "content2");
        map.put(5, "content5");

        Scanner scanner = new Scanner(System.in);
        System.out.println(map);

        System.out.print("Enter value to search: ");
        String value = scanner.nextLine();

        if(!map.containsValue(value)) {
            System.out.println("map does not contain a value of "+value);
        } else {
            System.out.println("map contains a value of "+value);
        }
    }

}
