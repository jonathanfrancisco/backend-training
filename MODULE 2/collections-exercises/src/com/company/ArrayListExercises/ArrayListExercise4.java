package com.company.ArrayListExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise4 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("yellow");
        colors.add("white");
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        for(int i = 0; i < colors.size(); i++) {
            System.out.println(i + " - "+colors.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index of the color you want to retrieve: ");
        int index = scanner.nextInt();

        System.out.println("Color '"+colors.get(index)+"' retrieved at index of "+index);



    }

}
