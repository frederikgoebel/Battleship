package com.company;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~ Battleships ~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Water:  ~ | Ship:   #");
        System.out.println("Enter 'exit' at any time to quit.");
        System.out.println("~~~~~~~~~~~~~ New Game ~~~~~~~~~~");
        System.out.println();

        while (true) {

            player1.Draw();
            if (!player1.Update())
                break;


            player2.Draw();
            if (!player2.Update())
                break;

        }

    }

}
