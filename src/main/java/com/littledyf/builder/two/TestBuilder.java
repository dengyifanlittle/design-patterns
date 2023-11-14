package com.littledyf.builder.two;


/**
 * @Author dengyifan
 * @create 2023/11/14 10:12
 * @description
 */
public class TestBuilder {
    public static void main(String[] args) {
        Product product = new Product.ConcreteBuilder("tom", "1")
                .builderPart2("2")
                .builderPart3("3")
                .build();
        System.out.println(product);
    }
}
