package com.company.LinkedListExercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExercise8 {

    public static void main(String[] args) {

        List<String> blockChain = new LinkedList<>();
        blockChain.add("info0");
        System.out.println(blockChain);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new info: ");
        String info = scanner.nextLine();
        blockChain.add(blockChain.size(), info);

        System.out.println(blockChain);

    }

}
