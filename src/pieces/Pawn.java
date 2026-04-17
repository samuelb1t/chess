package pieces;

import enums.Color;
import enums.Pieces;

public class Pawn extends Piece{

  private boolean hasMoved;

  public Pawn(Color color, Pieces type, String square, String symbol) {
    super(color, Pieces.PAWN, square, symbol);
    this.hasMoved = false;
  }

  @Override
  public String move(String from, String to) {

    hasMoved = true;
    return "Pawn moved from " + from + " to " + to;
  }

  public boolean hasMoved() {
    return hasMoved;
  }
}
