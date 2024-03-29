package com.tictactoe.strategies;

import com.tictactoe.models.Board;
import com.tictactoe.models.Move;

public interface winningstrategy {
    boolean checkWinner(Board board, Move move);

    void handleUndo(Board board, Move move);
}
