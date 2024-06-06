package com.littledyf.chain;

/**
 * @Author dengyifan
 * @create 2024/6/5 16:43
 * @description
 */
public class ConcreteHandlerOne extends Handler{

    @Override
    public void handleRequest(int request) {
        if(request >= 0 && request < 3){
            System.out.println(String.format("组长同意请假:%s天", request));
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
