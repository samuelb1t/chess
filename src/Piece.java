import enums.Color;
import enums.Pieces;

public class Piece {
  Color color;
  Pieces type;
  String square;
  String symbol;

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
}
