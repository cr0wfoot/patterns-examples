package factorymethod.inheritance.concretes.fish;

import factorymethod.inheritance.factory.Cargo;
import factorymethod.inheritance.factory.Creator;

public class FishCreator extends Creator {

    @Override
    public Cargo factoryMethod() {
        return new FishCargo();
    }
}
