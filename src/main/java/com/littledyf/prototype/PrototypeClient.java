package com.littledyf.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dengyifan
 * @create 2023/11/10 10:22
 * @description
 */
public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        UserPrototype userPrototype1 = new UserPrototype();

        userPrototype1.setName("tom");
        userPrototype1.setAge(18);
        List<String> messages1 = new ArrayList<>();
        messages1.add("test");
        userPrototype1.setMessages(messages1);

        UserPrototype userPrototype2 = userPrototype1.clone();

        System.err.println(String.format("两个对象是否一致：%s", userPrototype1 == userPrototype2));
        System.err.println(String.format("两个对象的name属性是否一致：%s", userPrototype1.getName() == userPrototype2.getName()));

        System.err.println(String.format("两个对象的messages属性是否一致：%s", userPrototype1.getMessages() == userPrototype2.getMessages()));

        System.err.println(userPrototype1.getMessages());
        System.err.println(userPrototype2.getMessages());

        messages1.clear();
        messages1.add("test1");
        System.err.println(userPrototype1.getMessages());
        System.err.println(userPrototype2.getMessages());


    }
}
