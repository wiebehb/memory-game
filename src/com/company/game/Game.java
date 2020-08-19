package com.company.game;
import java.util.Scanner;


public class Game {

    private int players;



    public Game(int numberOfPlayers) {
        this.players = numberOfPlayers;
    }


    public void playGame() {

        // set players
        Player p = new Player(players);

        // generate card overview
        Card c = new Card();
        c.generateCards();


        int playerOnSet = 1; // game always begins with player 1
        Scanner scan = new Scanner(System.in);


        // play game
        while (true) {

            // first round
            System.out.println("Player " + playerOnSet + " , choose your first card");
            System.out.println(c.getCards());
            int guessOne = scan.nextInt();
            int cardOne = c.getCards(guessOne);


            // second round
            System.out.println("Player " + playerOnSet + " , choose your second card");
            System.out.println(c.getCards());
            int guessTwo = scan.nextInt();
            int cardTwo = c.getCards(guessTwo);

            System.out.println(cardOne + " " + cardTwo);



            // in case of matched pairs, add 1 point to the player on set
            if(cardOne == cardTwo) {
                System.out.println("Matched pairs");
                //p.AddScore(playerOnSet); // add 1 point to player on set
                c.setCards(guessOne);
                c.setCards(guessTwo);


                System.out.println(p.getScoreCardPlayer(playerOnSet));

            } else if (cardOne != cardTwo) {
                System.out.println("Try again");
            }



            playerOnSet++;


            System.out.println("player " + playerOnSet);

        }




    }
}
