package com.company.LinkedListExercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExercise7 {

    public static void main(String[] args) {

        List<String> blockChain = new LinkedList<>();
        blockChain.add("info1");
        System.out.println(blockChain);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new info: ");
        String info = scanner.nextLine();
        blockChain.add(0, info);

        System.out.println(blockChain);

    }

}
