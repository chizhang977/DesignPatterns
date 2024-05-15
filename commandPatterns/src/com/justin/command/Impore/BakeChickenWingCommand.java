package com.justin.command.Impore;

public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecurer receiver) {
        super(receiver);
    }
    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
