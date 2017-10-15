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

    public boolean ProcessInput(String message) {
        System.out.print(message);
        while (true)
            // why cant I put the "System.out.print(message);" here??
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                return true;
            } else if (scanner.hasNext() && scanner.next().equals("exit")) {
                return false;
            } else {
                System.out.println("Invalid input. Enter an integer or 'exit'");
                System.out.print(message);
            }
    }
}

