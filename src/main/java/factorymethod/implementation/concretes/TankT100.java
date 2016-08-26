package factorymethod.implementation.concretes;

import factorymethod.implementation.factory.Tank;

public class TankT100 implements Tank {

    private final String description = "T-100 modern tank.";

    @Override
    public String getDescription() {
        return this.description;
    }
}
