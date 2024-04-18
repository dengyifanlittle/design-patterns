package com.littledyf.state;

/**
 * @Author dengyifan
 * @create 2024/4/7 14:35
 * @description
 */
public class ConcreteStateC extends State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 二档");
        context.setState(new ConcreteStateD());
    }
}
