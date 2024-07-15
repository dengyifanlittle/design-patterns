package com.littledyf.mediator;

/**
 * @Author dengyifan
 * @create 2024/7/12 10:15
 * @description 同事抽象类
 */
public abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(String message);

    public abstract void send(String message);
}
