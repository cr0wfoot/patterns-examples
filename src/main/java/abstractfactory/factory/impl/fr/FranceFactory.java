package abstractfactory.factory.impl.fr;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.Name;
import abstractfactory.factory.Population;
import abstractfactory.factory.Size;

public class FranceFactory implements AbstractFactory {
    
    @Override
    public Name getName() {
        return new FranceName();
    }

    @Override
    public Population getPopulation() {
        return new FrancePopulation();
    }

    @Override
    public Size getSize() {
        return new FranceSize();
    }
}
