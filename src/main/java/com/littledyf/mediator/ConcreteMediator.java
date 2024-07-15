package com.littledyf.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dengyifan
 * @create 2024/7/12 10:37
 * @description
 */
public class ConcreteMediator extends Mediator{
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void add(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void operation(Colleague colleague, String message) {
        for (Colleague coll : colleagues) {
            if (!coll.equals(colleague)) {
                coll.receive(message);
            }
        }
    }
}
