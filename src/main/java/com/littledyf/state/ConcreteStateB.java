package com.littledyf.state;

/**
 * @Author dengyifan
 * @create 2024/4/7 14:35
 * @description
 */
public class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 一档");
        context.setState(new ConcreteStateC());
    }
}
