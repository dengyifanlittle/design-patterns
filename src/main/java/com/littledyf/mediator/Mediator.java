package com.littledyf.mediator;

/**
 * @Author dengyifan
 * @create 2024/6/6 10:26
 * @description 中介者抽象类
 */
public abstract class Mediator {
    public abstract void add(Colleague colleague);

    public abstract void operation(Colleague colleague, String message);

}
