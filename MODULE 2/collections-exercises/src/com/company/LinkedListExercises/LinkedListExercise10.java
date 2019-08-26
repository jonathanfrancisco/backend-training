package com.company.LinkedListExercises;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExercise10 {

    public static void main(String[] args) {
        List<String> blockChain = new LinkedList<>();
        blockChain.add("info1");
        blockChain.add("info2");
        blockChain.add("info3");
        blockChain.add("info4");

        System.out.println(blockChain);
        System.out.println("First element: "+blockChain.get(0));
        System.out.println("Last element: "+blockChain.get(blockChain.size()-1));

    }

}
