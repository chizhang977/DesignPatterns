package com.justin.command.Impore;

// 命令抽象类
public abstract class Command {
    protected Barbecurer receiver;
    public Command(Barbecurer receiver)
    {
        this.receiver = receiver;
    }
    //执行命令
    public abstract void executeCommand();
}
