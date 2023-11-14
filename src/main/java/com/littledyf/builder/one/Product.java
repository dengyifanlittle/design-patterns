package com.littledyf.builder.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dengyifan
 * @create 2023/11/14 9:39
 * @description
 */
public class Product {
    private String name;

    private List<String> requires;

    private List<String> notRequires;

    public void setName(String name) {
        this.name = name;
    }

    public void setRequires(List<String> requires) {
        this.requires = requires;
    }

    public void setNotRequires(List<String> notRequires) {
        this.notRequires = notRequires;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", requires=" + requires +
                ", notRequires=" + notRequires +
                '}';
    }
}
