package factorymethod.implementation.concretes;

import factorymethod.implementation.factory.Tank;

public class TankT34 implements Tank {
    
    private final String description = "T-34 old tank.";

    @Override
    public String getDescription() {
        return this.description;
    }
}
