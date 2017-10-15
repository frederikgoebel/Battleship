package com.company;

/**
 * Created by frederikgoebel on 15.10.17.
 */
public class Player {
    public Map map;
    Input input;
    int id;
    String name;

    static int players = 0;

    public Player(){
        map = new Map();
        input = new Input();

        Player.players++;
        id = Player.players;
    }

    public boolean SetUp(Player enemy){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("~~~~~~~~~~~~ Player%d ~~~~~~~~~~~~\n", id);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        name = input.GetName("Enter your name: ");

        int shipsToSet = Map.maxShips;
        while(shipsToSet > 0){
            System.out.printf("Ship number %d\n",Map.maxShips-shipsToSet+1);
            if (!input.ProcessInput("Enter x: ", Map.sizeX))
                return false;
            int inputX = input.input;

            if (!input.ProcessInput("Enter y: ", Map.sizeY))
                return false;
            int inputY = input.input;

            if(!enemy.map.AddShip(inputX,inputY)){
                System.out.printf("You already set a ship at [%d,%d]\n", inputX, inputY);
            } else {
                shipsToSet--;
            }

        }
        return true;
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
            System.out.printf("~~~~~~~~~ %s won! ~~~~~~~~~\n", name);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            return false;
        }

        return true;
    }

    public void Draw(){
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("~~~~~~ It is %ss turn: ~~~~~~\n", name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        map.Draw();
    }
}
