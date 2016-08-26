package factorymethod.implementation.concretes;

import factorymethod.implementation.factory.Tank;

public class TankT70 implements Tank {

    private final String description = "T-70 strong tank.";

    @Override
    public String getDescription() {
        return this.description;
    }
}
