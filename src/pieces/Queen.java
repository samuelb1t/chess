package pieces;

import enums.Color;
import enums.Pieces;

public class Queen extends Piece {
  public Queen(Color color, Pieces type, String square, String symbol) {
    super(color, Pieces.QUEEN, square, symbol);
  }

  @Override
  public String move(String from, String to) {
    return "Queen moved from " + from + " to " + to;
  }

}
