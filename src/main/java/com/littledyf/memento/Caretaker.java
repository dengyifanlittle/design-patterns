package com.littledyf.memento;

/**
 * @Author dengyifan
 * @create 2024/4/30 14:12
 * @description 管理类
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
