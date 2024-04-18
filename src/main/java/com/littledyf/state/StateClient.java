package com.littledyf.state;

/**
 * @Author dengyifan
 * @create 2024/4/9 14:44
 * @description
 */
public class StateClient {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
        context.handle();
        context.handle();
        context.handle();

    }
}
