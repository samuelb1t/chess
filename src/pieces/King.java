package pieces;

import enums.Color;
import enums.Pieces;

public class King extends Piece {

  private boolean hasMoved;

  public King(Color color, Pieces type, String square, String symbol) {
    super(color, Pieces.KING, square, symbol);
    this.hasMoved = false;
  }

  @Override
  public String move(String from, String to) {
    return "King moved from " + from + " to " + to;
  }

  public boolean hasMoved() {
    return hasMoved;
  }
}
