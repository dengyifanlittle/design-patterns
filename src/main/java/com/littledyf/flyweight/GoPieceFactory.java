package com.littledyf.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author dengyifan
 * @create 2024/7/24 14:26
 * @description 享元工厂
 */
public class GoPieceFactory {
    private static final Map<String, GoPiece> pieceMap = new HashMap<>();

    public static GoPiece getPiece(String color) {
        GoPiece piece = pieceMap.get(color);
        if (piece == null) {
            if (color.equalsIgnoreCase("Black")) {
                piece = new BlackPiece();
            } else if (color.equalsIgnoreCase("White")) {
                piece = new WhitePiece();
            }
            pieceMap.put(color, piece);
        }
        return piece;
    }
}
