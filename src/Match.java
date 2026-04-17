import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import enums.Color;
import enums.Pieces;
import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;

public class Match {

  private Board board;

  private Scanner scanner; 


  public Match() {
    board = new Board();
    scanner = new Scanner(System.in);
  }

  // ♔ ♕ ♖ ♗ ♘ ♙
  // ♚ ♛ ♜ ♝ ♞ ♟
  public void start(){
    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

    int[] numbers = {1,2,3,4,5,6,7,8};
    String[] letters = {"a","b","c","d","e","f","g","h"}; 

    // Initialize the board with pieces in their starting positions
    // For example, placing white pieces  
    // Colocando as peças brancas
    board.setPiece(0, 0, new Rook(Color.WHITE, Pieces.ROOK, "a1", "\u2656"));
    board.setPiece(0, 1, new Knight(Color.WHITE, Pieces.KNIGHT, "b1", "\u2658"));
    board.setPiece(0, 2, new Bishop(Color.WHITE, Pieces.BISHOP, "c1", "\u2657"));
    board.setPiece(0, 3, new Queen(Color.WHITE, Pieces.QUEEN, "d1", "\u2655"));
    board.setPiece(0, 4, new King(Color.WHITE, Pieces.KING, "e1", "\u2654"));
    board.setPiece(0, 5, new Bishop(Color.WHITE, Pieces.BISHOP, "f1", "\u2657"));
    board.setPiece(0, 6, new Knight(Color.WHITE, Pieces.KNIGHT, "g1", "\u2658"));
    board.setPiece(0, 7, new Rook(Color.WHITE, Pieces.ROOK, "h1", "\u2656"));
    for (int i = 0; i < 8; i++) {
      board.setPiece(1, i, new Pawn(Color.WHITE, Pieces.PAWN, (char)('a' + i) + "2", "\u2659"));
    }

    // Colocando as peças pretas
    board.setPiece(7, 0, new Rook(Color.BLACK, Pieces.ROOK, "a8", "\u265C"));
    board.setPiece(7, 1, new Knight(Color.BLACK, Pieces.KNIGHT, "b8", "\u265E"));
    board.setPiece(7, 2, new Bishop(Color.BLACK, Pieces.BISHOP, "c8", "\u265D"));
    board.setPiece(7, 3, new Queen(Color.BLACK, Pieces.QUEEN, "d8", "\u265B"));
    board.setPiece(7, 4, new King(Color.BLACK, Pieces.KING, "e8", "\u265A"));
    board.setPiece(7, 5, new Bishop(Color.BLACK, Pieces.BISHOP, "f8", "\u265D"));
    board.setPiece(7, 6, new Knight(Color.BLACK, Pieces.KNIGHT,"g8", "\u265E"));
    board.setPiece(7, 7, new Rook(Color.BLACK, Pieces.ROOK, "h8", "\u265C"));
    for (int i = 0; i < 8; i++) {
      board.setPiece(6, i, new Pawn(Color.BLACK, Pieces.PAWN, (char)('a' + i) + "7", "\u265F"));
    }

    while (true){
      for (int row = 0; row < 8; row++) {
        for (int col = 0; col < 9; col++) {
          if(col == 0){
            System.out.print(letters[row] + " ");
          }else{
            Piece piece = board.getPiece(row, col-1);
            if (piece != null) {
              System.out.print(piece.getSymbol() + " ");
            } else {
              System.out.print(". ");
            }
          }
        }
        System.out.println();
      }
      System.out.print("  ");
      for(int i=0; i < 8; i++){System.out.print(numbers[i] + " ");}

      System.out.println();
      System.out.println("Move:");
      String move = scanner.nextLine();
      String[] parts = move.split(" ");

      System.out.println("From: " + parts[0] + " To: " + parts[1]);
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    }
  }

}
