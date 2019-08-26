package com.company.LinkedListExercises;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExercise4 {

    public static void main(String[] args) {

        List<String> blockChain = new LinkedList<>();
        blockChain.add("info1");
        blockChain.add("info2");
        blockChain.add("info3");
        blockChain.add("info4");
        System.out.println(blockChain);

        System.out.print("Iterated in reverse: ");
        ListIterator listIterator = blockChain.listIterator(blockChain.size());
        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous()+ ", ");
        }

    }

}
