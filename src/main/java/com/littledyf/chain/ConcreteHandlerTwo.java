package com.littledyf.chain;

/**
 * @Author dengyifan
 * @create 2024/6/5 16:48
 * @description
 */
public class ConcreteHandlerTwo extends Handler{
    @Override
    public void handleRequest(int request) {
        if(request >= 3 && request < 10){
            System.out.println(String.format("经理同意请假:%s天", request));
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
