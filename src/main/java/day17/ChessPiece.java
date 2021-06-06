package day17;

public enum ChessPiece {
    EMPTY(-1, "_"),

    KING_WHITE(100, "♔"), QUEEN_WHITE(9, "♕"), ROOK_WHITE(5, "♖"),
    BISHOP_WHITE(3.5,"♗"), KNIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),

    KING_BLACK(100, "♚"), QUEEN_BLACK(9, "♛"), ROOK_BLACK(5, "♜"),
    BISHOP_BLACK(3.5,"♝"), KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟")
    ;
    private double value;
    private String view;

    ChessPiece(double value, String view) {
        this.value = value;
        this.view = view;
    }

    public String getView() {
        return view;
    }

    @Override
    public String toString() {
        return  view;
    }
}
