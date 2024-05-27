package com.littledyf.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * @Author dengyifan
 * @create 2024/5/27 14:16
 * @description
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<String>  tests = Arrays.asList
                ("test1", "test2", "test3", "test4", "test5");

        for (String s: tests) {
            System.out.println(s);
        }
    }
}
