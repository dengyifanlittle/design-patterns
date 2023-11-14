package com.littledyf.prototype;

import java.util.List;

/**
 * @Author dengyifan
 * @create 2023/11/10 10:19
 * @description
 */
public class UserPrototype implements Cloneable{

    private String name;

    private Integer age;

    private List<String> messages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    protected UserPrototype clone() throws CloneNotSupportedException {
        return (UserPrototype) super.clone();
    }
}
