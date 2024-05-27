package com.littledyf.iterator;

import java.util.List;

/**
 * @Author dengyifan
 * @create 2024/5/27 15:10
 * @description
 */
public class ConcreteIterator<T> implements Iterator{
    private List<T> aggregate;

    private int index;

    public ConcreteIterator(List<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public T next() {
        return aggregate.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < aggregate.size() ? true : false;
    }
}
