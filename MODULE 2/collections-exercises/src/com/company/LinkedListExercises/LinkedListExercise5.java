package com.company.LinkedListExercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExercise5 {

    public static void main(String[] args) {

        List<String> blockChain = new LinkedList<>();
        blockChain.add("info1");
        blockChain.add("info2");
        blockChain.add("info3");
        blockChain.add("info4");
        blockChain.add("info5");

        System.out.println(blockChain);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new info: ");
        String info = scanner.next();
        System.out.print("Specify position by index to put it in: ");
        int index = scanner.nextInt();

        blockChain.add(index, info);
        System.out.println(blockChain);

    }

}
