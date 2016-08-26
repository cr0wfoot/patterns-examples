package factorymethod.inheritance.concretes.bananas;

import factorymethod.inheritance.factory.Cargo;
import factorymethod.inheritance.factory.Creator;

public class BananasCreator extends Creator {

    @Override
    public Cargo factoryMethod() {
        return new BananasCargo();
    }
}
