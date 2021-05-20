package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadderGame {
    //Constant
    final static int START_POSITION = 0;
    final static int NUMBER_OF_PLAYER = 0;
    final static int NUMBER_OF_PLAY = 1;
    final static int LDDER = 2;
    final static int SNAKE = 3;
    static int USER_POSITION = START_POSITION;
    final static int Win_Point = 100;

    //two position
    static int USER1_POSITION = START_POSITION;
    static int USER2_POSITION = START_POSITION;

    //variable
    static int numberOfThrownDice = 0;

    //set position
    public static void setUser1Position(int user1Position) {
        SnakeAndLadderGame.USER1_POSITION = user1Position;
    }

    //set position
    public static int getUser1Position() {
        return USER1_POSITION;
    }

    //Given 1 to 6 random number
    public static int rollDice() {
        Random randomNumber = new Random();
        int diceValue = randomNumber.nextInt(6) + 1;
        return diceValue;
    }

    //set position
    public static void setUser2Position(int userPosition) {
        SnakeAndLadderGame.USER_POSITION = userPosition;
    }

    //get position
    public static int getUser2Position() {
        return USER_POSITION;
    }

    //player option
    public static int playerOption() {
        Random randomNumber = new Random();
        int option = randomNumber.nextInt(3) + 1;
        return option;
    }

    //player1
    public int player1()
    {
        numberOfThrownDice=numberOfThrownDice+1;
        int numberOnDice=rollDice();
        int option= playerOption();
        if ( getUser1Position() < 1)
        {
            setUser1Position(START_POSITION);
        }

        if (option == NUMBER_OF_PLAY)
        {
            setUser1Position(getUser1Position());
        }
        else if (option == LDDER)
        {
            if (getUser1Position()+rollDice() > 100)
            {
                setUser1Position(getUser1Position());
            }
            else
            {
                setUser1Position(getUser1Position()+rollDice());
            }

        }
        else if(option == SNAKE)
        {
            setUser1Position(getUser1Position()-rollDice());
        }
        System.out.println(" Times of Dice Thrown : " + numberOfThrownDice + " Position of Player 1 :" +getUser1Position());
        return USER1_POSITION;
    }

    //player2
    public int player2()
    {
        numberOfThrownDice=numberOfThrownDice+1;
        int numberOnDice=rollDice();
        int option= playerOption();
        if ( getUser2Position() < 1)
        {
            setUser2Position(START_POSITION);
        }

        if (option == NUMBER_OF_PLAY)
        {
            setUser2Position(getUser2Position());
        }
        else if (option == LDDER)
        {
            if (getUser2Position()+rollDice() > 100)
            {
                setUser2Position(getUser2Position());
            }
            else
            {
                setUser2Position(getUser2Position()+rollDice());
            }

        }
        else if(option == SNAKE)
        {
            setUser2Position(getUser2Position()-rollDice());
        }
        System.out.println(" Times of Dice Thrown : " + numberOfThrownDice + " Position of Player 2 :" +getUser2Position());
        return USER2_POSITION;
    }


    public static void main(String[] args) {
        //object
        SnakeAndLadderGame snakeLadder=new SnakeAndLadderGame();
        while (true)
        {
            int player1Position=snakeLadder.player1();
            int player2Position=snakeLadder.player2();
            if (player1Position == 100)
            {
                System.out.println("player 1 Won the game ");
                System.out.println("Total number of time thrown dice : " +numberOfThrownDice);
                break;
            }
            else if (player2Position ==100)
            {
                System.out.println("player 2 won the game");
                System.out.println("Total number of time thrown dice : " +numberOfThrownDice);
                break;
            }


        }

    }
}
