package factorymethod.concretes.bananas;

import factorymethod.factory.Cargo;
import factorymethod.factory.Creator;

public class BananasCreator extends Creator {

    @Override
    public Cargo factoryMethod() {
        return new BananasCargo();
    }
}
