package com.justin.command.basic;
//Command, 抽象命令类
public abstract class Command {
    protected Receiver receiver;
    public Command(Receiver receiver)
    {
        this.receiver = receiver;
    }
    public abstract void executeCommand();
}
