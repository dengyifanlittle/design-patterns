package com.littledyf.builder.two;

/**
 * @Author dengyifan
 * @create 2023/11/14 10:07
 * @description
 */
public class Product {
    private String name;
    private String part1;
    private String part2;
    private String part3;

    public Product(ConcreteBuilder concreteBuilder) {
        this.name = concreteBuilder.name;
        this.part1 = concreteBuilder.part1;
        this.part2 = concreteBuilder.part2;
        this.part3 = concreteBuilder.part3;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                '}';
    }

    public static class ConcreteBuilder {
        private String name;
        private String part1;
        private String part2;
        private String part3;

        public ConcreteBuilder(String name, String part1){
            this.name = name;
            this.part1 = part1;
        }

        public ConcreteBuilder builderPart2(String part2) {
            this.part2 = part2;
            return this;
        }

        public ConcreteBuilder builderPart3(String part3) {
            this.part3 = part3;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

}
