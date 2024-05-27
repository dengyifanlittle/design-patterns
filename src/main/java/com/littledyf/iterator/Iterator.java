package com.littledyf.iterator;

/**
 * @Author dengyifan
 * @create 2024/5/27 14:44
 * @description
 */
public interface Iterator<T> {

    T next();

    boolean hasNext();
}
