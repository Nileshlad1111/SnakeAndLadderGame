package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadderGame {

    //Constant
    final static int START_POSITION=0;
    final static int NUMBER_OF_PLAYER=1;

    //Given 1 to 6 random number
    public static int rollDice()
    {
        Random randomNumber=new Random();
        int diceValue=randomNumber.nextInt(6)+1;
        return diceValue;
    }
    public static void main(String[] args) {
        System.out.println("Given random number 1 to 6 = "+rollDice());

    }
}
