package pieces;

import enums.Color;
import enums.Pieces;

public abstract class Piece {
  private Color color;
  private Pieces type;
  private String square;
  private String symbol;

  public Piece(Color color, Pieces type, String square, String symbol) {
    this.color = color;
    this.type = type;
    this.square = square;
    this.symbol = symbol;
  }

  public Color getColor() {
    return color;
  }

  public Pieces getType() {
    return type;
  }

  public String getSquare() {
    return square;
  }

  public String getSymbol() {
    return symbol;
  }

  public abstract String move(String from, String to);
}
