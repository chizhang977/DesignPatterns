package com.justin.command.barbecuer;

public class BakeMuttonCommand extends Command{
    public BakeMuttonCommand(Barbecurer receiver) {
        super(receiver);
    }
    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
