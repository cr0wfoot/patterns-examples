package factorymethod.inheritance.concretes.silk;

import factorymethod.inheritance.factory.Cargo;

public class SilkCargo extends Cargo {

    private final String name = "Silk";
    private final int weight = 10;
    private final int length = 3;
    private final int height = 2;
    private final int width = 1;
    
    @Override
    public String getDescription() {
        return this.name + " " + this.weight + "kg " + this.length + ":" + 
               this.height + ":" + this.width + "m";
    }
}
