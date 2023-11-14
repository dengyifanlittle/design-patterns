package com.littledyf.prototype;

import java.io.*;
import java.util.List;

/**
 * @Author dengyifan
 * @create 2023/11/10 15:43
 * @description
 */
public class UserPrototypeDeep implements Serializable {
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

    protected UserPrototypeDeep deepClone() throws Exception{
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (UserPrototypeDeep) ois.readObject();
    }
}
