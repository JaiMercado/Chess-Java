package engine;

import model.Color;
import model.PieceType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameState {
    private final Board board;
    private Color currentTurn;
    private GameStatus status;
    private final List<Move> moveHistory;
    private int halfMoveClock;  // resets on pawn move or capture (50-move rule)
    private int fullMoveNumber; // increments after Black moves
}
