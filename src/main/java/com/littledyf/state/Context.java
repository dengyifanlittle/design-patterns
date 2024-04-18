package com.littledyf.state;

/**
 * @Author dengyifan
 * @create 2024/4/7 14:33
 * @description
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        state.handle(this);
    }
}
