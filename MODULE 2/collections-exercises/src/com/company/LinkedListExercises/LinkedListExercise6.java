package com.company.LinkedListExercises;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExercise6 {

    public static void main(String[] args) {

        List<String> blockChain = new LinkedList<>();
        blockChain.add("info1");
        blockChain.add("info2");
        blockChain.add("info3");
        blockChain.add("info4");

        System.out.println("Before adding: "+blockChain);
        blockChain.add(0,"info0");
        blockChain.add(blockChain.size(), "info5");
        System.out.println("After adding first and last position elements: "+blockChain);

    }

}
