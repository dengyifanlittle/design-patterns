package com.littledyf.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dengyifan
 * @create 2024/5/31 17:02
 * @description
 */
public class Invoker {

    private List<Command> commands = new ArrayList<>();

   public void setCommand(Command command){
       commands.add(command);
   }

   public void removeCommand(Command command){
       commands.remove(command);
       System.err.println("取消订单");
   }

    public void call(){
       for (Command command : commands){
           command.execute();

       }
    }
}
