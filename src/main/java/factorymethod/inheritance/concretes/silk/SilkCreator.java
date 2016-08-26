package factorymethod.inheritance.concretes.silk;

import factorymethod.inheritance.factory.Cargo;
import factorymethod.inheritance.factory.Creator;

public class SilkCreator extends Creator {

    @Override
    public Cargo factoryMethod() {
        return new SilkCargo();
    }
}
