package com.whitecloak;

public class Main {

    public static void main(String[] args) {
        Twitter t = new Twitter("scores.txt");
        t.readFile();
        t.setSentence("it is worsening suspects");
        double score = t.computeSentiment();
        System.out.println(score);
        String sentiment = t.sentiment();
        System.out.println(sentiment);
    }

}
