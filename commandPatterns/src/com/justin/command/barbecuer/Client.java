package com.justin.command.barbecuer;

public class Client {
    public static void main(String[] args)
    {
        Barbecurer boy = new Barbecurer();
        Command bakeChickenWingCommand = new BakeChickenWingCommand(boy);
        Command bakeMuttonCommand = new BakeMuttonCommand(boy);
        Waiter girl = new Waiter();

        girl.setOrder(bakeChickenWingCommand);
        girl.notifyCommand();
        girl.setOrder(bakeMuttonCommand);
        girl.notifyCommand();
        girl.setOrder(bakeMuttonCommand);
        girl.notifyCommand();
    }
}
