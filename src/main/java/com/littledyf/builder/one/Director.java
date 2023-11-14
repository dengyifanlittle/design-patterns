package com.littledyf.builder.one;


/**
 * @Author dengyifan
 * @create 2023/11/14 9:47
 * @description
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(String part1, String part2) {
        builder.buildPart1(part1);
        builder.buildPart2(part2);
        return builder.getProduct();
    }
}
