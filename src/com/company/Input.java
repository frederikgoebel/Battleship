package com.company;

import java.util.Scanner;


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
        while (true) {
            System.out.print(message);
            String in = scanner.nextLine();
            if(in.length() > 8)
                System.out.println("Name must be shorter than 8 characters");
            else
                return in;
        }
    }
}

