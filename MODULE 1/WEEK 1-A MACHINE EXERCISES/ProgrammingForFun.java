package com.whitecloak;

import java.util.Scanner;

public class ProgrammingForFun {

    public static void main(String[] args) {

        String uniqueLettersString = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String yourName = scanner.nextLine().toLowerCase();

        System.out.print("Enter crush name: ");
        String crushName = scanner.nextLine().toLowerCase();

        for(int i = 0;i<yourName.length();i++) {
            if(crushName.indexOf(yourName.charAt(i)) < 0 && yourName.charAt(i) != '.') {
                uniqueLettersString += yourName.charAt(i);
            }
        }

        for(int i = 0;i<crushName.length();i++) {
            if(yourName.indexOf(crushName.charAt(i)) < 0 && crushName.charAt(i) != '.') {
                uniqueLettersString += crushName.charAt(i);
            }
        }

        int flamesLetterPosition = (uniqueLettersString.length() % 6);
        switch(flamesLetterPosition) {
            case 1:
                System.out.print("Friendship"); break;
            case 2:
                System.out.println("Love"); break;
            case 3:
                System.out.println("Affection"); break;
            case 4:
                System.out.println("Marriage"); break;
            case 5:
                System.out.println("Enemy"); break;
            case 0:
                System.out.println("Soulmate"); break;
        }

    }
}
