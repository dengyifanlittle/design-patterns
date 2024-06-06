package com.littledyf.chain;

/**
 * @Author dengyifan
 * @create 2024/6/5 16:49
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandlerOne();
        Handler handler2 = new ConcreteHandlerTwo();
        Handler handler3 = new ConcreteHandlerThree();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        handler1.handleRequest(1);
        handler1.handleRequest(4);
        handler1.handleRequest(15);
        handler1.handleRequest(40);
    }
}
