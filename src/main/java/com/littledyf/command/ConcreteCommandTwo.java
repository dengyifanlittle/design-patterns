package com.littledyf.command;

/**
 * @Author dengyifan
 * @create 2024/5/31 17:25
 * @description
 */
public class ConcreteCommandTwo  implements Command{
    private Receiver receiver;

    public ConcreteCommandTwo(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionTwo();
    }
}
