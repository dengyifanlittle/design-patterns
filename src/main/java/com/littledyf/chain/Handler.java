package com.littledyf.chain;

/**
 * @Author dengyifan
 * @create 2024/6/5 16:41
 * @description
 */
public abstract class Handler {

    public Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
