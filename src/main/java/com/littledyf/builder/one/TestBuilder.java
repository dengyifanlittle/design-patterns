package com.littledyf.builder.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dengyifan
 * @create 2023/11/14 9:49
 * @description
 */
public class TestBuilder {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilderOne();
        Director director = new Director(builder);
        List<String> requires = new ArrayList<>();
        requires.add("鸡肉");
        requires.add("胡萝卜");
        requires.add("花生");
        requires.add("盐");
        director.construct("宫爆鸡丁", requires);
        List<String> notRequires = new ArrayList<>();
        notRequires.add("小葱");
        builder.buildNotRequires(notRequires);
        Product product = builder.getProduct();
        System.out.println(product);
    }
}
