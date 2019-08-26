package com.company.TreeSetExercises;

import java.util.TreeSet;

public class TreeSetExercise5 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(80);
        numbers.add(100);
        numbers.add(20);
        numbers.add(35);

        System.out.println("First element of the tree set: "+numbers.first());
        System.out.println("Last element of the tree set: "+numbers.last());

    }

}
