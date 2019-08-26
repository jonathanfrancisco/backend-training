package com.company.ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExercise9 {

    public static void main(String[] args) {

        List<String> wcColorScheme = new ArrayList<>();
        wcColorScheme.add("white");
        wcColorScheme.add("dark blue");
        System.out.println("White Cloak color scheme: "+wcColorScheme);


        List<String> myWcColorSchemeCopy = new ArrayList<>();
        System.out.println("My copy of White Cloak scheme before: "+myWcColorSchemeCopy);

        System.out.println("\n...Copying White Cloak color scheme......\n");
        myWcColorSchemeCopy = wcColorScheme.stream().collect(Collectors.toList());

        System.out.println("My copy of White Cloak scheme after: "+myWcColorSchemeCopy);




    }

}
