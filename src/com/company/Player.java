package com.company;

/**
 * Created by frederikgoebel on 15.10.17.
 */
public class Player {
    Map map;
    Input input;
    int id;

    static int players = 0;

    public Player(){
        map = new Map();
        input = new Input();

        Player.players++;
        id = Player.players;
    }


    public boolean Update(){

        if (!input.ProcessInput("Enter x: ", Map.sizeX))
            return false;
        int inputX = input.input;

        if (!input.ProcessInput("Enter y: ", Map.sizeY))
            return false;
        int inputY = input.input;


        if (map.Uncover(inputX,inputY)){
            System.out.println("It's a hit!");
        } else{
            System.out.println("Just some water...");
        }

        if(map.shipCount == 0){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.printf("~~~~~~~~~ Player%d won! ~~~~~~~~~\n", id);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            return false;
        }

        return true;
    }

    public void Draw(){
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("~~~~~~ It is Player%d turn: ~~~~~~\n", id);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        map.Draw();
    }
}
