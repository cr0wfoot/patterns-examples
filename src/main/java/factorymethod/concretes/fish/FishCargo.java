package factorymethod.concretes.fish;

import factorymethod.factory.Cargo;

public class FishCargo extends Cargo {

    private final String name = "Fish";
    private final int weight = 250;
    private final int length = 4;
    private final int height = 2;
    private final int width = 2;
    
    @Override
    public String getDescription() {
        return this.name + " " + this.weight + "kg " + this.length + ":" + 
               this.height + ":" + this.width + "m";
    }
}
