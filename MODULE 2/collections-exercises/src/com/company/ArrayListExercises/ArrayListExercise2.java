package com.company.ArrayListExercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise2 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("white");

        colors.forEach((i) -> System.out.println(i));

    }

}
