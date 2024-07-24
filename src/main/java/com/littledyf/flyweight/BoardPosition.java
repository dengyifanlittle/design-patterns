package com.littledyf.flyweight;

/**
 * @Author dengyifan
 * @create 2024/7/24 14:29
 * @description 棋盘位置类，包含享元对象和位置，共享GoPiece对象，以及不共享的x、y位置信息
 */
public class BoardPosition {
    private final int size;
    private final GoPiece[][] board;

    public BoardPosition(int size) {
        this.size = size;
        this.board = new GoPiece[size][size];
    }

    public void placePiece(String color, int x, int y) {
        GoPiece piece = GoPieceFactory.getPiece(color);
        board[x][y] = piece;
        piece.place(x, y);
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getColor().charAt(0) + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public GoPiece getPieceAt(int x, int y) {
        return board[x][y];
    }
}
