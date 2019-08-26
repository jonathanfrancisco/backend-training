package com.company.LinkedListExercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExercise9 {

    public static void main(String[] args) {

        List<String> blockChain = new LinkedList<>();
        blockChain.add("info1");
        blockChain.add("info2");
        blockChain.add("info3");

        System.out.println("block chain: "+blockChain);

        List<String> anotherBlockChain = new LinkedList<>();
        anotherBlockChain.add("info4");
        anotherBlockChain.add("info5");
        System.out.println("another block chain: "+anotherBlockChain);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index position on block chain to put another blockchain: ");
        int index = scanner.nextInt();

        blockChain.addAll(index, anotherBlockChain);
        System.out.println("block chain: "+blockChain);

    }

}
