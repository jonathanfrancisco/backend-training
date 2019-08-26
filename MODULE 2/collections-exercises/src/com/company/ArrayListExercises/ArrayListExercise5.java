package com.company.ArrayListExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise5 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("yellow");
        colors.add("white");

        for(int i = 0; i < colors.size(); i++) {
            System.out.println(i + " - "+colors.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the color you want to update: ");
        int index = scanner.nextInt();

        System.out.print("New Value: ");
        String color = scanner.next();


        System.out.println("Color '"+colors.set(index, color)+"' at index "+index+" has been updated to '"+color+"'");
        for(int i = 0; i < colors.size(); i++) {
            System.out.println(i + " - "+colors.get(i));
        }






    }

}
