package com.company.ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise8 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("yellow");
        colors.add("white");
        colors.add("red");
        colors.add("green");

        System.out.println("Before sorting: "+colors);
        Collections.sort(colors);
        System.out.println("After sorting: "+colors);




    }
}
