package com.littledyf.builder.one;


/**
 * @Author dengyifan
 * @create 2023/11/14 9:40
 * @description
 */
public abstract class Builder {

    public abstract void buildPart1(String part1);

    public abstract void buildPart2(String part2);

    public abstract void buildPart3(String part3);

    public abstract void buildPart4(String part4);


    public abstract Product getProduct();
}
