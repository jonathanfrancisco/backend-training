package com.company.HashSetExercises;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercise5 {

    public static void main(String[] args) {

        Set<String> studentIds = new HashSet<>();
        studentIds.add("2015-10101");

        if(!studentIds.isEmpty()) {
            System.out.println("It's not empty :)");
        } else {
            System.out.println("It's empty!!! :(");
        }

    }

}
