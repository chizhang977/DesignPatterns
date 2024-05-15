package com.justin.command.Impore;

public class Client {
    public static void main(String[] args)
    {
        Barbecurer boy = new Barbecurer();
        Command bakeChickenWingCommand = new BakeChickenWingCommand(boy);
        Command bakeMuttonCommand = new BakeMuttonCommand(boy);
        Waiter girl = new Waiter();

        System.out.println("开门营业");
        girl.setOrder(bakeChickenWingCommand);
        girl.setOrder(bakeMuttonCommand);
        girl.setOrder(bakeMuttonCommand);
        girl.setOrder(bakeMuttonCommand);
        girl.setOrder(bakeMuttonCommand);

        girl.cancelOrder(bakeMuttonCommand);
        System.out.println("开始烧烤");
        girl.notifyCommand();
    }
}
