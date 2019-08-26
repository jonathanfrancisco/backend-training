package com.whitecloak;
import java.util.*;

public class WorseMorse {

    static LinkedHashMap<String, String> morseCodes = new LinkedHashMap<>();

    public static void main(String[] args) {
	// write your code here
        morseCodes.put(".-", "A");
        morseCodes.put("-...", "B");
        morseCodes.put("-.-.", "C");
        morseCodes.put("-..", "D");
        morseCodes.put(".", "E");
        morseCodes.put("..-.", "F");
        morseCodes.put("--.", "G");
        morseCodes.put("....", "H");
        morseCodes.put("..", "I");
        morseCodes.put(".---", "J");
        morseCodes.put("-.-", "K");
        morseCodes.put(".-..", "L");
        morseCodes.put("--", "M");
        morseCodes.put("-.", "N");
        morseCodes.put("---", "O");
        morseCodes.put(".--.", "P");
        morseCodes.put("--.-", "Q");
        morseCodes.put(".-.", "R");
        morseCodes.put("...", "S");
        morseCodes.put("-", "T");
        morseCodes.put("..-", "U");
        morseCodes.put("...-", "V");
        morseCodes.put(".--", "W");
        morseCodes.put("-..-", "X");
        morseCodes.put("-.--", "Y");
        morseCodes.put("--..", "Z");
        decodeMorse("-..-----.");
    }

    public static void decodeMorse(String morse) {
        permutate(morse, "");
    }

    public static void permutate(String str, String permuted) {
        LinkedHashMap<String, String> lettersMatched = new LinkedHashMap<>();
        for(String key: morseCodes.keySet()) {
            if(str.startsWith(key)) {
                String letter = morseCodes.get(key);
                String remainder = str.substring(key.length());
                lettersMatched.put(remainder, letter);
            }
        }
        if(lettersMatched.isEmpty()) {
            System.out.println(permuted+" ");
            return;
        }
        for(String key: lettersMatched.keySet()) {
            String letter = lettersMatched.get(key);
            permutate(key, permuted + letter);
        }
    }

}
