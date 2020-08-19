package com.company.game;
import java.util.ArrayList;


public class Card {

    private int amountOfCards;
    private ArrayList<Integer> cards = new ArrayList<>(); // store cards in arraylist


    public Card() {
        this.amountOfCards = 24;
    }


    public void generateCards() { // generate cards in pairs of 2
        int c = 0;

        for(int i = 0; i < amountOfCards; i++) {
            cards.add(c);

            if(i % 2 != 0) {
                c++;
            }
        }
    }


    public int getCards(int position) { // return card position
        return cards.get(position);
    }


    public int setCards(int position) { // delete card position
        return cards.remove(position);
    }


    public ArrayList<Integer> getCards() {
        return cards;
    }
}
