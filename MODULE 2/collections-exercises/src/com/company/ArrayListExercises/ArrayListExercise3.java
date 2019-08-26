package com.company.ArrayListExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise3 {

    public static void main(String[] args) {


        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println(colors);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a color to add at the first position: ");
        String color = scanner.nextLine();

        colors.add(0, color);
        System.out.println(colors);



    }

}
