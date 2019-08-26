package com.whitecloak;

import java.util.HashMap;
import java.util.Scanner;

public class PNLP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> moods = new HashMap<>();
        moods.put("wth", 4);
        moods.put("omg", 7);
        moods.put("happy", 10);
        moods.put("great", 10);
        moods.put("awesome", 8);
        moods.put("sad", 1);
        moods.put("disappointing", 2);
        moods.put("hello", 2);
        moods.put("relieved", 9);
        moods.put("damn", 3);
        moods.put("hard", 4);

        System.out.print("Enter tweet: ");
        String tweet = scanner.nextLine().toLowerCase();

        double totalRate = 0;
        double moodMatchCount = 0;
        for(String mood: moods.keySet()) {
            if(tweet.contains(mood)) {
                totalRate += moods.get(mood);
                moodMatchCount++;
            }
        }

        double averageTotalRate = totalRate / moodMatchCount;
        System.out.println(averageTotalRate >= 5 ? ("happy") : (averageTotalRate > 0 && averageTotalRate < 5) ? ("sad") : "neutral");
    }
}
