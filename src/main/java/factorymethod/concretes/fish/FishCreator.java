package factorymethod.concretes.fish;

import factorymethod.factory.Cargo;
import factorymethod.factory.Creator;

public class FishCreator extends Creator {

    @Override
    public Cargo factoryMethod() {
        return new FishCargo();
    }
}
