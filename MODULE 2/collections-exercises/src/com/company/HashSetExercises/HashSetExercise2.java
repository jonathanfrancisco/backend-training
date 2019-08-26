package com.company.HashSetExercises;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercise2 {

    public static void main(String[] args) {

        Set<String> studentIds = new HashSet<>();
        studentIds.add("2015-10101");
        studentIds.add("2015-10111");
        studentIds.add("2015-10326");

        studentIds.forEach((id) -> {
            System.out.println(id);
        });

    }

}
