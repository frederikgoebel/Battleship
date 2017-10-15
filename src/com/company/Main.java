package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~ Battleships ~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Instructions:");
        System.out.println("    Water:  ~\n    Ship:   #");
        System.out.println("    Enter 'exit' at any time to quit.");
        System.out.println();
        System.out.print("Loading");
        for(int i=0; i<26; i++){
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        Flush();
        System.out.println("~~~~~~~~~~~~~ New Game ~~~~~~~~~~");
        System.out.println();

        if(!player1.SetUp(player2))
            return;
        Flush();
        if(!player2.SetUp(player1))
            return;
        Flush();

        while (true) {

            player1.Draw();
            if (!player1.Update())
                break;


            player2.Draw();
            if (!player2.Update())
                break;

        }

    }

    public static void Flush(){
        for(int i=0; i< 100; i++){
            System.out.println();
        }

    }



}
