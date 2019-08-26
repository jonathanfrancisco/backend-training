package com.company.ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExercise10 {

    public static void main(String[] args) {

        List<Card> deckOfCards = new ArrayList<>();
        deckOfCards.add(new Card("Ace", "Hearts"));
        deckOfCards.add(new Card("8", "Hearts"));
        deckOfCards.add(new Card("4", "Spades"));
        deckOfCards.add(new Card("5", "Diamonds"));
        deckOfCards.add(new Card("3", "Clubs"));

        System.out.println("Before shuffling the deck of cards: "+deckOfCards);
        Collections.shuffle(deckOfCards);
        System.out.println("After shuffling the deck of cards: "+deckOfCards);

    }

}

class Card {

    String value;
    String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        return value+" of "+suit;
    }

}
