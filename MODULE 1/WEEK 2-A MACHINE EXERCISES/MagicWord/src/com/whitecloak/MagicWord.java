package com.whitecloak;
import java.util.LinkedHashMap;

public class MagicWord {

    public static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length() / 2; i++) {
            char leftChar = str.charAt(i);
            char rightChar = str.charAt((str.length()-1)-i);
            if(leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }

    public static String skyscrapper(String str) {
        String skyScraperStr = "";
        for(int i = 0;i<str.length();i++) {
            if(i % 2 == 0) {
                skyScraperStr += Character.toString(str.charAt(i)).toUpperCase();
            } else {
                skyScraperStr += Character.toString(str.charAt(i)).toLowerCase();
            }
        }
        return skyScraperStr;
    }

    public static String vowel(String str) {
        return str.replaceAll("[^aeiou]","");
    }

    public static String consonant(String str) {
        return str.replaceAll("[aeiou]", "");
    }

    public static void countEachLetter(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                int newCount = map.get(str.charAt(i)) + 1;
                map.put(str.charAt(i), newCount);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        for(Character key: map.keySet()) {
            System.out.println(key+" - "+map.get(key));
        }
    }

}
