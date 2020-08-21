package com.company.game;


public class Player {

    private int amountOfPlayers;
    private int[] scoreCard;

    public Player(int players) {
        this.amountOfPlayers = players;
        scoreCard = new int[amountOfPlayers];
    }


    public void AddScore(int player) {
        scoreCard[player]++;
    }


    public int getScoreCardPlayer(int pos) {
        return scoreCard[pos];
    }


    // print player(s) with the highest score
    public void printWinner() { getIndexOfLargest(scoreCard); }


    // return index of highest value in array to determine winner
    public void getIndexOfLargest( int[] array ) {

        int max = getLargest(array);

        int a = 0;

        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                a++;
            }
        }

        System.out.println();

        // in case of one winner
        if (a == 1) {
            System.out.print("No cards left, the winner is player: ");

            for (int i = 0; i < array.length; i++) {
                if (max == array[i]) {
                    System.out.println(i);
                }
            }
        }

        // in case of multiple winners
        if (a > 1) {
            System.out.print("No cards left, multiple winners: ");

            for (int i = 0; i < array.length; i++) {
                if (max == array[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    }


    public int getLargest( int[] array ) {
        if ( array == null || array.length == 0 ) return -1;

        int max = array[0];
        for ( int i = 1; i < array.length; i++ )
        {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
