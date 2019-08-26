package com.company.HashSetExercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetExercise1 {

    public static void main(String[] args) {

        Set<String> studentIds = new HashSet<>();
        studentIds.add("2015-10101");
        studentIds.add("2015-10111");

        System.out.println(studentIds);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();
        studentIds.add(studentId);

        System.out.println(studentIds);

    }

}
