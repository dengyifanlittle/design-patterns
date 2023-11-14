package com.littledyf.builder.one;

import java.util.List;

/**
 * @Author dengyifan
 * @create 2023/11/14 9:42
 * @description
 */
public class ConcreteBuilderOne extends Builder{
    private Product product = new Product();


    @Override
    public void buildName(String name) {
        product.setName(name);
    }

    @Override
    public void buildRequires(List<String> requires) {
        product.setRequires(requires);
    }

    @Override
    public void buildNotRequires(List<String> notRequires) {
        product.setNotRequires(notRequires);
    }


    @Override
    public Product getProduct() {
        return product;
    }
}
