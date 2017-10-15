package com.company;

/**
 * Created by frederikgoebel on 15.10.17.
 */
public class Player {
    Map map;
    Input input;
    int id;

    static int players = 0;

    public Player(int mapSizeX,int mapSizeY){
        map = new Map(mapSizeX,mapSizeY);
        input = new Input();

        Player.players++;
        id = Player.players;
    }

    public boolean Update(){


        if (!input.ProcessInput("Enter x: "))
            return false;
        int inputX = input.input;

        if (!input.ProcessInput("Enter y: "))
            return false;
        int inputY = input.input;


        if (map.Uncover(inputX,inputY)){
            System.out.println("It's a hit!");
        } else{
            System.out.println("Just some water...");
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
