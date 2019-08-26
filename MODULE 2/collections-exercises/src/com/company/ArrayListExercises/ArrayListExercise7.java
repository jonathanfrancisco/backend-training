package com.company.ArrayListExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise7 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("yellow");
        colors.add("white");
        colors.add("red");
        colors.add("green");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of color you want to search: ");
        String color = scanner.nextLine();

        if(!colors.contains(color)) {
            System.out.println("No results.");
        }

        else {
            System.out.println("Color "+color+" found at index "+colors.indexOf(color));
        }


    }

}
