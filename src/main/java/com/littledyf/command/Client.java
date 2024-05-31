package com.littledyf.command;

import java.util.Arrays;

/**
 * @Author dengyifan
 * @create 2024/5/31 17:03
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command commandOne = new ConcreteCommandOne(receiver);
        Command commandTwo = new ConcreteCommandTwo(receiver);
        Command commandThree = new ConcreteCommandThree(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(commandOne);
        invoker.setCommand(commandTwo);
        invoker.setCommand(commandThree);

        invoker.removeCommand(commandTwo);

        invoker.call();


    }
}
