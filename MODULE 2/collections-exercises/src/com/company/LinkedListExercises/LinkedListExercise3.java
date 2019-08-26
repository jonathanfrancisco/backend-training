package com.company.LinkedListExercises;

import java.util.*;

public class LinkedListExercise3 {

    public static void main(String[] args) {

        List<String> blockChain = new LinkedList<>();
        blockChain.add("info1");
        blockChain.add("info2");
        blockChain.add("info3");
        blockChain.add("info4");
        System.out.println(blockChain);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index to start iterating: ");
        int index = scanner.nextInt();

        ListIterator iterator = blockChain.listIterator(index);

        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ,");
        }

    }

}
