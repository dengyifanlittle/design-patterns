package com.littledyf.builder.two;


/**
 * @Author dengyifan
 * @create 2023/11/14 10:12
 * @description
 */
public class TestBuilder {
    public static void main(String[] args) {
        Product product = new Product.ConcreteBuilder("part1", "part2")
//                .builderPart3("part3")
                .builderPart4("part4")
                .build();
        System.out.println(product);
    }
}
