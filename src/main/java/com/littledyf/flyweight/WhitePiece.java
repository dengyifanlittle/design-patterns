package com.littledyf.flyweight;

/**
 * @Author dengyifan
 * @create 2024/7/24 14:26
 * @description 具体享元类，白棋
 */
public class WhitePiece implements GoPiece{
    private final String color = "White";

    @Override
    public String getColor() {
        return color;
    }


    @Override
    public void place(int x, int y) {
        System.out.println("棋子：" + color + "，位置信息：(" + x + ", " + y + ")");
    }
}
