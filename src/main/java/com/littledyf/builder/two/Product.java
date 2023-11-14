package com.littledyf.builder.two;

/**
 * @Author dengyifan
 * @create 2023/11/14 10:07
 * @description
 */
public class Product {
    private String part1;
    private String part2;
    private String part3;
    private String part4;


    public Product(ConcreteBuilder concreteBuilder) {
        this.part1 = concreteBuilder.part1;
        this.part2 = concreteBuilder.part2;
        this.part3 = concreteBuilder.part3;
        this.part4 = concreteBuilder.part4;
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

    public static class ConcreteBuilder {
        private String part1;
        private String part2;
        private String part3;
        private String part4;


        public ConcreteBuilder(String part1, String part2){
            this.part1 = part1;
            this.part2 = part2;
        }

        public ConcreteBuilder builderPart3(String part3) {
            this.part3 = part3;
            return this;
        }

        public ConcreteBuilder builderPart4(String part4) {
            this.part4 = part4;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

}
