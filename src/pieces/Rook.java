package pieces;

import enums.Color;
import enums.Pieces;

public class Rook extends Piece {

  private boolean hasMoved;
  
  public Rook(Color color, Pieces type, String square, String symbol) {
    super(color, Pieces.ROOK, square, symbol);
  }

  @Override
  public String move(String from, String to) {
    return "Rook moved from " + from + " to " + to;
  }

  public boolean hasMoved() {
    return hasMoved;
  }
}
