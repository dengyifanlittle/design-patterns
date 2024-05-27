package com.littledyf.iterator;


/**
 * @Author dengyifan
 * @create 2024/5/27 15:21
 * @description
 */
public class Client {
    public static void main(String[] args) {

        ConcreteAggregate<String> aggregate = new ConcreteAggregate();
        aggregate.add("1");
        aggregate.add("2");

        Iterator<String> iterator = aggregate.getIterator();

        while (iterator.hasNext()){
            Object s = iterator.next();
            System.out.println(s);
        }
    }
}
