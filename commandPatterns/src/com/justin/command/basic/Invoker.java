package com.justin.command.basic;
//要求命令执行这个请求
public class Invoker {
    private Command command;
    public void setCommand(Command command)
    {
        this.command = command;
    }
    public void action()
    {
        this.command.executeCommand();
    }
}
