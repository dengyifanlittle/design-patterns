package com.littledyf.bridge.type;

/**
 * @Author dengyifan
 * @create 2023/11/13 11:02
 * @description
 */
public class ShortType extends TypeApi{
    @Override
    public void type() {
        System.err.print("短袖->");
        colorApi.paint();
        sizeApi.size();
    }
}
