package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(10,10);
        Player player2 = new Player(10,10);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~ Battleships ~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Water:  ~ | Ship:   #");
        System.out.println("Enter 'exit' at any time to quit.");
        System.out.println("~~~~~~~~~~~~~ New Game ~~~~~~~~~~");
        System.out.println();
        int inputX;
        int inputY;

        while (true) {

            player1.Draw();
            if (!player1.Update())
                break;


            player2.Draw();
            if (!player2.Update())
                break;



        }

    }

    public static void GetInput(){

    }

}
