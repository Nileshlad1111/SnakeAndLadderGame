package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadderGame {



    //Constant
    final static int START_POSITION=0;
    final static int NUMBER_OF_PLAYER=1;
    final static int NUMBER_OF_PLAY=1;
    final static int LDDER=2;
    final static int SNAKE=3;
    static int USER_POSITION=START_POSITION;

    //Given 1 to 6 random number
    public static int rollDice()
    {
        Random randomNumber=new Random();
        int diceValue= randomNumber.nextInt(6)+1;
        return diceValue;
    }

    //set position
    public static void setUserPosition(int userPosition) {
        SnakeAndLadderGame.USER_POSITION = userPosition;
    }

    //get position
    public static int getUserPosition() {
        return USER_POSITION;
    }

    //player option
    public static int playerOption()
    {
        Random randomNumber=new Random();
        int option=randomNumber.nextInt(3)+1;
        return option;
    }
    public static void main(String[] args) {

        //method call
        int numberOnDice=rollDice();
        int option= playerOption();


        if (option == NUMBER_OF_PLAY)
        {
            setUserPosition(getUserPosition());
        }
        else if (option == LDDER)
        {
            setUserPosition(getUserPosition()+rollDice());
        }
        else if(option == SNAKE)
        {
            setUserPosition(getUserPosition()-rollDice());
        }
        System.out.println(getUserPosition());
    }

    }

