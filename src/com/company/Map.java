package com.company;

import java.util.Arrays;

/**
 * Created by frederikgoebel on 15.10.17.
 */
    public class Map {
        char[][] map;
        boolean[][] ships;

    public Map(int sizeX, int sizeY){
        map = new char[sizeX][sizeY];
        for(int i=0; i< map.length; i++){
            Arrays.fill(map[i], ' ');
        }

        ships = new boolean[sizeX][sizeY];
        ships[2][3] = true;
        ships[1][3] = true;
        ships[2][1] = true;
    }

    public void Uncover(int x, int y){
        if(ships[x][y]){
            map[x][y] = '#';
        } else{
            map[x][y] = '~';
        }
    }

    public void Draw(){
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
    }

}
