package pieces;

import enums.Color;
import enums.Pieces;

public class Bishop extends Piece {
  public Bishop(Color color, Pieces type, String square, String symbol) {
    super(color, Pieces.BISHOP, square, symbol);
  }

  @Override
  public String move(String from, String to) {
    return "Bishop moved from " + from + " to " + to;
  }

}
