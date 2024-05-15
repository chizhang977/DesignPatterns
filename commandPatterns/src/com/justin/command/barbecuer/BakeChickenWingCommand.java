package com.justin.command.barbecuer;

public class BakeChickenWingCommand extends Command{
    public BakeChickenWingCommand(Barbecurer receiver) {
        super(receiver);
    }
    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
