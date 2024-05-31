package com.littledyf.command;

/**
 * @Author dengyifan
 * @create 2024/5/31 16:59
 * @description
 */
public class ConcreteCommandOne implements Command{

    private Receiver receiver;

    public ConcreteCommandOne(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionOne();
    }
}
