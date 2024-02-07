package com.tictactoe.models;


import java.util.List;

import com.tictactoe.strategies.winningstrategy;

public class Game {
    private List<Player> playes;
    private Board board;
    private List<Move> moves;
    private List<winningstrategy> winstrategy;
    private Player winner;
    private GameState gamestate;
    private int nextMovePlayerIdx;

    public List<Player> getPlayes() {
        return this.playes;
    }

    public void setPlayes(List<Player> playes) {
        this.playes = playes;
    }

    public Board getBoard() {
        return this.board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return this.moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<winningstrategy> getWinstrategy() {
        return this.winstrategy;
    }

    public void setWinstrategy(List<winningstrategy> winstrategy) {
        this.winstrategy = winstrategy;
    }

    public Player getWinner() {
        return this.winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGamestate() {
        return this.gamestate;
    }

    public void setGamestate(GameState gamestate) {
        this.gamestate = gamestate;
    }

    public int getNextMovePlayerIdx() {
        return this.nextMovePlayerIdx;
    }

    public void setNextMovePlayerIdx(int nextMovePlayerIdx) {
        this.nextMovePlayerIdx = nextMovePlayerIdx;
    }

}   
