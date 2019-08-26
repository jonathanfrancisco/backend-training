package com.company.ArrayListExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise6 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("yellow");
        colors.add("white");
        colors.add("red");
        colors.add("green");

        System.out.println(colors);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Remove third element? Enter key 'Y' to remove, any to terminate program: ");
        String pressedKey = scanner.nextLine();

        if(pressedKey.equalsIgnoreCase("Y")) {
            colors.remove(2);
            System.out.println("Third element has been removed.");
        }

        System.out.println(colors);

    }
}
