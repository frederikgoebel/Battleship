package com.company;

import java.util.Scanner;

/**
 * Created by frederikgoebel on 15.10.17.
 */
public class Input {
    Scanner scanner;
    int input;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public boolean ProcessInput(String message, int max) {

        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 0 && input <= max)
                    return true;
            } else if (scanner.hasNext() && scanner.next().equals("exit")) {
                return false;
            }
            System.out.println("Invalid input.\nEnter an number between 0 and " + max + " or 'exit'");
        }
    }

    public String GetName(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
}

