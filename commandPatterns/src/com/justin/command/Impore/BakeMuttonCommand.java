package com.justin.command.Impore;

public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecurer receiver) {
        super(receiver);
    }
    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
