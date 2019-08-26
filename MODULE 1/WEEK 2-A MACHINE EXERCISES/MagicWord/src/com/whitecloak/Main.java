package com.whitecloak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String word = new Scanner(System.in).nextLine();
        System.out.println(MagicWord.isPalindrome(word));
        System.out.println(MagicWord.skyscrapper(word));
        System.out.println(MagicWord.vowel(word));
        System.out.println(MagicWord.consonant(word));
        MagicWord.countEachLetter(word);
    }

}
