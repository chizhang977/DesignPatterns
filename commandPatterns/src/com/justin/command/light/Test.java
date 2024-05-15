package com.justin.command.light;

import java.util.Stack;

//命令接口
interface Command {
    void execute();
    void undo();
}
//具体命令
 class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

 class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

//接收者
class Light {
    public void on() {
        System.out.println("The light is on.");
    }

    public void off() {
        System.out.println("The light is off.");
    }
}

//调用者
 class RemoteControl {
    private Command command;
    private Stack<Command> history = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        history.push(command);
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();  // 输出: The light is on.

        remote.pressUndo();    // 输出: The light is off.

        remote.setCommand(lightOff);
        remote.pressButton();  // 输出: The light is off.

        remote.pressUndo();    // 输出: The light is on.
    }
}




