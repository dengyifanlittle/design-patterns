package com.littledyf.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dengyifan
 * @create 2024/5/27 15:13
 * @description
 */
public class ConcreteAggregate<T> implements Aggregate{

    private List<T> aggregate;

    public ConcreteAggregate() {
        this.aggregate = new ArrayList<>();
    }


    @Override
    public void add(Object item) {
        this.aggregate.add((T) item);
    }

    @Override
    public Iterator<T> getIterator() {
        return new ConcreteIterator(this.aggregate);
    }
}
