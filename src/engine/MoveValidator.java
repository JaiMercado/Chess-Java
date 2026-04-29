package engine;

import model.Color;
import model.Piece;
import model.Square;
import java.util.ArrayList;
import java.util.List;

// MoveValidator checks whether a move is legal before it is applied.
// Filters pseudo-legal moves by simulating them and checking if the king is left in check.
// NOTE (Pawn Demo): leavesKingInCheck() is skipped since there is no King on the board yet.
// Will be re-enabled once King and other pieces are added.

public class MoveValidator {

    private final GameState gameState;

    public MoveValidator(GameState gameState) {
        this.gameState = gameState;
    }

}
