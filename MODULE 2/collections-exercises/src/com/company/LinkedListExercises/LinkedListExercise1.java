package com.company.LinkedListExercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExercise1 {

    public static void main(String[] args) {

        List<String> programmingLanguages = new LinkedList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        System.out.println(programmingLanguages);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter programming language: ");
        String programmingLanguage = scanner.nextLine();

        programmingLanguages.add(programmingLanguage);
        System.out.println(programmingLanguages);


    }

}
