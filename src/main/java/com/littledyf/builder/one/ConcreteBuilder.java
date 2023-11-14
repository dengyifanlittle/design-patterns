package com.littledyf.builder.one;


/**
 * @Author dengyifan
 * @create 2023/11/14 9:42
 * @description
 */
public class ConcreteBuilder extends Builder{
    private Product product = new Product();

    @Override
    public void buildPart1(String part1) {
        product.setPart1(part1);
    }

    @Override
    public void buildPart2(String part2) {
        product.setPart2(part2);
    }

    @Override
    public void buildPart3(String part3) {
        product.setPart3(part3);
    }

    @Override
    public void buildPart4(String part4) {
        product.setPart4(part4);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
