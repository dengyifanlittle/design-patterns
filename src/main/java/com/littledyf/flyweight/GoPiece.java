package com.littledyf.flyweight;

/**
 * @Author dengyifan
 * @create 2024/7/24 14:26
 * @description 享元接口
 */
public interface GoPiece {
    String getColor();

    void place(int x, int y);
}
