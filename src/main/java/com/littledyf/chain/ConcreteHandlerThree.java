package com.littledyf.chain;

/**
 * @Author dengyifan
 * @create 2024/6/5 16:48
 * @description
 */
public class ConcreteHandlerThree extends Handler{
    @Override
    public void handleRequest(int request) {
        if(request >= 10 && request <= 30){
            System.out.println(String.format("CEO同意请假:%s天", request));
        }else {
            System.out.println("请假天数不符合要求");;
        }
    }
}
