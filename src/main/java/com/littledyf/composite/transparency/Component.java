package com.littledyf.composite.transparency;

/**
 * @Author dengyifan
 * @create 2024/5/9 10:20
 * @description
 */
public abstract class Component {


    abstract void add(Component component);

    abstract void remove(Component component);

    abstract void display(int depth);

    abstract void operation();
}
