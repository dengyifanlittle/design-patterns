package com.littledyf.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dengyifan
 * @create 2023/11/10 15:46
 * @description
 */
public class PrototypeDeepClient {
    public static void main(String[] args) throws Exception {
        UserPrototypeDeep userPrototypeDeep1 = new UserPrototypeDeep();
        userPrototypeDeep1.setAge(19);
        userPrototypeDeep1.setName("tom");
        List<String> messages1 = new ArrayList<>();
        messages1.add("test");
        userPrototypeDeep1.setMessages(messages1);

        UserPrototypeDeep userPrototypeDeep2 = userPrototypeDeep1.deepClone();

        System.err.println(String.format("两个对象是否一致：%s", userPrototypeDeep1 == userPrototypeDeep2));
        System.err.println(String.format("两个对象的name属性是否一致：%s", userPrototypeDeep1.getName() == userPrototypeDeep2.getName()));

        System.err.println(String.format("两个对象的messages属性是否一致：%s", userPrototypeDeep1.getMessages() == userPrototypeDeep2.getMessages()));

        System.err.println(userPrototypeDeep1.getMessages());
        System.err.println(userPrototypeDeep2.getMessages());
        messages1.clear();
        messages1.add("test1");
        System.err.println(userPrototypeDeep1.getMessages());
        System.err.println(userPrototypeDeep2.getMessages());

    }
}
