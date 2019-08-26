package com.company.TreeSetExercises;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExercise2 {

    public static void main(String[] args) {

        Set<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        colors.forEach((c) -> {
            System.out.println(c);
        });

    }

}
