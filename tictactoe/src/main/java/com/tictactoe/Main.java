package com.tictactoe;

import com.tictactoe.models.Board;
import com.tictactoe.models.Game;

public class Main {
    public static void main(String[] args) {
        Game g1=new Game();
        g1.setNextMovePlayerIdx(20);
        System.out.println("Hello world!");
        
        System.out.println(g1.getNextMovePlayerIdx());
    }
}