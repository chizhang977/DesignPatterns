package com.justin.command.barbecuer;
// 服务员
public class Waiter {
    private Command command;
    public void setOrder(Command command)
    {
        this.command = command;
    }
    public void notifyCommand()
    {
        command.executeCommand();
    }
}
