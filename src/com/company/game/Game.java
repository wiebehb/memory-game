package com.company.game;
import java.util.*;


public class Game {

    private int players;

    public Game(int numberOfPlayers) {
        this.players = numberOfPlayers;
    }


    // get user input within range of memory cards
    public int getIntInput(int sizeCards) {
        Scanner intReader = new Scanner(System.in);

        while(true) {
            int currentInput = intReader.nextInt();

            if(currentInput >= 0 && currentInput < sizeCards){
                return currentInput;
            }

            System.out.println("Not within range cards, try again");
        }
    }


    public void playGame() {
        Player p = new Player(players); // set players
        Card c = new Card(); // generate card overview
        c.generateCards();

        int playerOnSet = 0; // game begins with player 0
        int guessOne, guessTwo, cardOne, cardTwo;


        // play game
        while (true) {

            // first round
            System.out.println("Player " + playerOnSet + " , choose your first card");
            System.out.println(c.getCards());
            guessOne = getIntInput(c.getSizeCards());
            cardOne = c.getCards(guessOne);


            // second round
            System.out.println("Player " + playerOnSet + " , choose your second card");
            //System.out.println(c.getCards());
            guessTwo = getIntInput(c.getSizeCards());
            cardTwo = c.getCards(guessTwo);


            // in case of matched pairs, add 1 point to the player on set
            if(cardOne == cardTwo) {
                System.out.println("Matched pairs");
                p.AddScore(playerOnSet); // add 1 point to player on set
                c.setCards(cardOne, cardTwo);

                if(c.getSizeCards() == 0) {
                    p.printWinner();
                    break;
                }


            } else if (cardOne != cardTwo) {
                System.out.println("Try again");
            }


            // next player
            playerOnSet++;

            if (playerOnSet == players) {
                playerOnSet = 0;
            }

            System.out.println();
        }
    }
}
