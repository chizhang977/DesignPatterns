package com.justin.command.basic;

public class ConcreteCommand extends Command{
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }
    @Override
    public void executeCommand() {
        receiver.action();
    }
}
