package com.littledyf.mediator;

/**
 * @Author dengyifan
 * @create 2024/7/12 10:39
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Mediator concreteMediator = new ConcreteMediator();
        Colleague concreteColleague1 = new ConcreteColleagueOne();
        Colleague concreteColleague2 = new ConcreteColleagueTwo();
        concreteMediator.add(concreteColleague1);
        concreteMediator.add(concreteColleague2);
        concreteColleague1.send("Hello1");
        concreteColleague2.send("Hello2");
    }
}
