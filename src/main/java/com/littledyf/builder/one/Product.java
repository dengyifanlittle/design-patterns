package com.littledyf.builder.one;


/**
 * @Author dengyifan
 * @create 2023/11/14 9:39
 * @description
 */
public class Product {
    private String part1;
    private String part2;
    private String part3;
    private String part4;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    public void setPart4(String part4) {
        this.part4 = part4;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                ", part4='" + part4 + '\'' +
                '}';
    }
}
