package factorymethod.implementation.factory;

import factorymethod.implementation.concretes.TankT100;
import factorymethod.implementation.concretes.TankT34;
import factorymethod.implementation.concretes.TankT70;

public class CreatorImpl implements Creator {

    @Override
    public Tank getTank(String name) {
        if ("T-34".equals(name))
            return new TankT34();
        else if ("T-70".equals(name))
            return new TankT70();
        else if ("T-100".equals(name))
            return new TankT100();
        return null;
    }
}
