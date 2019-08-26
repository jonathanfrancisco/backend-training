package com.whitecloak;

public abstract class TwitterAbstract {

    String filename;
    double score;
    String sentence;
    String[] words = new String[2477];
    String[] scores = new String[2477];

    TwitterAbstract(String filename) {
        this.filename = filename;
    }

    //read a .txt file and then populate words[] and scores[]
    abstract void readFile();
    abstract void setSentence(String sentence);
    abstract double computeSentiment();
    abstract String sentiment();

}