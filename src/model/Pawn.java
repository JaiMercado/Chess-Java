package model;

public class Pawn extends Piece{
    public Pawn(Color color) {
        super(color, PieceType.PAWN);
    }

    @Override
    public String getSymbol() {
        return color == Color.WHITE ? "P" : "p";
    }

    @Override
    public List<Move> getPseudoLegalMoves(Board board, Square from) {
        List<Move> moves = new ArrayList<>();

        int currentRow = from.getRow();
        int currentCol = from.getCol();

        return moves;
    }

}
