package com.littledyf.memento;

/**
 * @Author dengyifan
 * @create 2024/4/30 14:12
 * @description
 */
public class Client {
    public static void main(String[] args) {

        // 开始状态
        Originator originator = new Originator("林克","海拉鲁", 30, 15);
        System.out.println("初始状态：" + originator);

        // 存档
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.save());

        // 消耗
        originator.setBlood(5);
        originator.setVigor(5);

        System.out.println("消耗后：" + originator);

        // 读档
        originator.recover(caretaker.getMemento());

        System.out.println("读取后：" + originator);


    }
}
