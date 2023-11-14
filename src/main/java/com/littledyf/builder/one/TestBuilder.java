package com.littledyf.builder.one;


/**
 * @Author dengyifan
 * @create 2023/11/14 9:49
 * @description
 */
public class TestBuilder {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct("part1", "part2");
        builder.buildPart3("part3");
        Product product = builder.getProduct();
        System.out.println(product);
    }
}
