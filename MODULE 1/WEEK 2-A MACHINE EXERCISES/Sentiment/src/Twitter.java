package com.whitecloak;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Twitter extends TwitterAbstract {

    public Twitter(String filename) {
        super(filename);
    }

    @Override
    void readFile() {
        try {
            FileReader fileReader = new FileReader(super.filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            int index = 0;
            while((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split("\t");
                super.words[index] = arr[0];
                super.scores[index] = arr[1];
                index++;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    void setSentence(String sentence) {
        super.sentence = sentence;
    }

    @Override
    double computeSentiment() {
        double totalScore = 0;
        double matchCount = 0;
        String[] sentenceWords = super.sentence.split(" ");
        for(String sentenceWord: sentenceWords) {
            for(int i = 0; i < super.words.length; i++) {
                if(sentenceWord.equals(super.words[i])) {
                    matchCount++;
                    totalScore += Double.parseDouble(super.scores[i]);
                }
            }
        }
        System.out.println(totalScore+"/"+matchCount);
        super.score = (totalScore / matchCount);
        return super.score;
    }

    @Override
    String sentiment() {
        if(super.score >= 5) {
            return "positive";
        } else if (super.score < 0) {
            return "negative";
        }
        return "neutral";
    }

}
