package factorymethod.concretes.silk;

import factorymethod.factory.Cargo;
import factorymethod.factory.Creator;

public class SilkCreator extends Creator {

    @Override
    public Cargo factoryMethod() {
        return new SilkCargo();
    }
}
