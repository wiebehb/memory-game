package com.company.game;
import java.util.*;


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


    public void setCards(int positionOne, int positionTwo) { // delete card position
        int posOne = cards.indexOf(positionOne);
        cards.remove(posOne);

        int posTwo = cards.indexOf(positionTwo);
        cards.remove(posTwo);
    }


    public ArrayList<Integer> getCards() {
        return cards;
    }


    public int getSizeCards() {
        return cards.size();
    }
}
