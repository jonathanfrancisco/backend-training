package com.company.HashSetExercises;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercise3 {

    public static void main(String[] args) {

        Set<String> studentIds = new HashSet<>();
        studentIds.add("2015-10101");
        studentIds.add("2015-10111");
        studentIds.add("2015-10326");

        System.out.println("There are "+studentIds.size()+" studentIds in the HashSet");

    }

}
