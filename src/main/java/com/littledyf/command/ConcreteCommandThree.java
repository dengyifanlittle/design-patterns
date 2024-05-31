package com.littledyf.command;

/**
 * @Author dengyifan
 * @create 2024/5/31 17:25
 * @description
 */
public class ConcreteCommandThree  implements Command{
    private Receiver receiver;

    public ConcreteCommandThree(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionThree();
    }
}
