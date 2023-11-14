package com.littledyf.builder.one;

import java.util.List;

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

    public Product construct(String name, List<String> requires) {
        builder.buildRequires(requires);
        builder.buildName(name);
        return builder.getProduct();
    }
}
