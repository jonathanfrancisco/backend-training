package com.company.TreeSetExercises;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExercise4 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(80);
        numbers.add(100);
        numbers.add(20);
        numbers.add(35);
        numbers.add(101);

        System.out.println("Not reversed: "+numbers);
        System.out.print("Reversed: ");
        Iterator iterator = numbers.descendingIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+", ");
        }




    }

}
