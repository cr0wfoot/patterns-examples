package command;

import command.light.*;

public class Run {

    public static void main(String[] args) {
        Light light = new Light();
        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);
        Switch switcher = new Switch(turnOn, turnOff);

        switcher.TurnOnLight();
        switcher.TurnOffLight();
    }
}
