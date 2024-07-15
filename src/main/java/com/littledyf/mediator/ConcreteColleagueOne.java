package com.littledyf.mediator;

/**
 * @Author dengyifan
 * @create 2024/7/12 10:38
 * @description
 */
public class ConcreteColleagueOne extends Colleague{


    @Override
    public void receive(String message) {
        System.out.println("具体同事类 ConcreteColleagueOne 接收请求:" + message);

    }

    @Override
    public void send(String message) {
        System.out.println("具体同事类 ConcreteColleagueOne 发送请求:" + message);
        mediator.operation(this, message);
    }
}
