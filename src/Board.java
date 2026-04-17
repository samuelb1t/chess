public class Board {

  private Piece[][] squares;

  public Board() {
    squares = new Piece[8][8];
  }

  public Piece getPiece(int row, int col) {
    return squares[row][col];
  }

  public void setPiece(int row, int col, Piece piece) {
    squares[row][col] = piece;
  }
}
