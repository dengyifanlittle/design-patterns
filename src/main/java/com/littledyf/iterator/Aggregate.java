package com.littledyf.iterator;

/**
 * @Author dengyifan
 * @create 2024/5/27 14:47
 * @description
 */
public interface Aggregate<T> {
   void add(T str);

   Iterator<T> getIterator();
}
