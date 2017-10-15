package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Map map = new Map(8,8);
        Input input = new Input();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~ Battleships ~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Water:  ~ | Ship:   #");
        System.out.println("Enter 'exit' at any time to quit.");
        System.out.println("~~~~~~~~~~~~~ New Game ~~~~~~~~~~");
        System.out.println();
        int inputX = 0;
        int inputY = 0;

        while (true) {

            map.Draw();
            System.out.println();

            if (!input.ProcessInput("Enter x: "))
                break;
            inputX = input.input;

            if (!input.ProcessInput("Enter y: "))
                break;
            inputY = input.input;


            map.Uncover(inputX,inputY);


        }

    }

    public static void GetInput(){

    }

}
