package com.company.LinkedListExercises;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExercise2 {

    public static void main(String[] args) {

       List<String> blockChain = new LinkedList<>();
       blockChain.add("some encrypted info 1");
       blockChain.add("some encrypted info 2");
       blockChain.add("some encrypted info 3");
       blockChain.add("some encrypted info 4");

       blockChain.forEach((b) -> {
           System.out.println(b);
       });

    }

}
