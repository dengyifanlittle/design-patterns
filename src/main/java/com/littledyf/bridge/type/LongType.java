package com.littledyf.bridge.type;

/**
 * @Author dengyifan
 * @create 2023/11/13 11:01
 * @description
 */
public class LongType extends TypeApi{
    @Override
    public void type() {
        System.err.print("长袖->");
        colorApi.paint();
        sizeApi.size();
    }
}
