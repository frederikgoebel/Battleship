package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] map = new char[8][8];
        for(int i=0; i< map.length; i++){
            Arrays.fill(map[i],' ');
        }

        boolean[][] ships = new boolean[8][8];
        ships[2][3] = true;
        ships[5][3] = true;
        ships[2][6] = true;

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

            for (int y = -1; y < map.length; y++) {
                for (int x = -1; x < map.length; x++) {
                    if(y == -1){
                        if(x == -1) {
                            System.out.print("   ");
                        } else{
                            System.out.print(" " + x + " ");
                        }
                    } else if(x == -1){
                        System.out.print(" " + y + " ");
                    } else {
                        System.out.print("[" + map[x][y] + "]");
                    }
                }
                System.out.println();
            }
            System.out.println();

            System.out.print("Enter x: ");
            if(scanner.hasNextInt()) {
                inputX = scanner.nextInt();
            } else if(scanner.hasNext()) {
                if(scanner.next().equals("exit")){
                    break;
                }
            }

            System.out.print("Enter y: ");
            if(scanner.hasNextInt()) {
                inputY = scanner.nextInt();
            } else if(scanner.hasNext()) {
                if(scanner.next().equals("exit")){
                    break;
                }
            }

            if(ships[inputX][inputY]){
                map[inputX][inputY] = '#';
            } else{
                map[inputX][inputY] = '~';
            }

        }

    }

}
