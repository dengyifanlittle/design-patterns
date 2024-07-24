package com.littledyf.flyweight;

/**
 * @Author dengyifan
 * @create 2024/7/24 14:27
 * @description
 */
public class Client {
    public static void main(String[] args) {
        BoardPosition board = new BoardPosition(19);

        board.placePiece("Black", 1, 2);
        board.placePiece("White", 2, 3);
        board.placePiece("Black", 3, 4);
        board.placePiece("White", 4, 5);

        board.printBoard();

        GoPiece piece1 = board.getPieceAt(1, 2);
        GoPiece piece2 = board.getPieceAt(2, 3);
        GoPiece piece3 = board.getPieceAt(3, 4);
        GoPiece piece4 = board.getPieceAt(4, 5);

        System.out.println("棋子1和棋子3: " + (piece1 == piece3));
        System.out.println("棋子2和棋子4: " + (piece2 == piece4));
    }
}
