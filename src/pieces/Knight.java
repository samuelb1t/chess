package pieces;

import enums.Color;
import enums.Pieces;

public class Knight extends Piece {
  public Knight(Color color, Pieces type, String square, String symbol) {
    super(color, Pieces.KNIGHT, square, symbol);
  }

  @Override
  public String move(String from, String to) {
    return "Knight moved from " + from + " to " + to;
  }

}
