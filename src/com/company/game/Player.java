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

}
