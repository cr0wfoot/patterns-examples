package abstractfactory.factory.impl.it;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.Name;
import abstractfactory.factory.Population;
import abstractfactory.factory.Size;

public class ItalyFactory implements AbstractFactory {
    
    @Override
    public Name getName() {
        return new ItalyName();
    }
    @Override
    public Population getPopulation() {
        return new ItalyPopulation();
    }
    @Override
    public Size getSize() {
        return new ItalySize();
    }
}
