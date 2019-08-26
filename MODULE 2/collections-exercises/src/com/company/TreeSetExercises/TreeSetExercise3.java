package com.company.TreeSetExercises;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExercise3 {

    public static void main(String[] args) {

        Set<String> wcColorScheme = new TreeSet<>();
        wcColorScheme.add("white");
        wcColorScheme.add("dark blue");

        Set<String> newColors = new TreeSet<>();
        newColors.add("red");
        newColors.add("green");
        newColors.add("blue");

        System.out.println("Before adding newColors: "+wcColorScheme);
        wcColorScheme.addAll(newColors);
        System.out.println("After adding newColors: "+wcColorScheme);

    }

}
