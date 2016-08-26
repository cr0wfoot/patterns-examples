package factorymethod.inheritance.concretes.bananas;

import factorymethod.inheritance.factory.Cargo;

public class BananasCargo extends Cargo {

    private final String name = "Bananas";
    private final int weight = 120;
    private final int length = 2;
    private final int height = 1;
    private final int width = 1;

    @Override
    public String getDescription() {
        return this.name + " " + this.weight + "kg " + this.length + ":" + 
               this.height + ":" + this.width + "m";
    }
}
