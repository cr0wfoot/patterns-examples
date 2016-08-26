package abstractfactory.factory.impl.eng;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.Name;
import abstractfactory.factory.Population;
import abstractfactory.factory.Size;

public class EnglandFactory implements AbstractFactory {
    
    @Override
    public Name getName() {
        return new EnglandName();
    }

    @Override
    public Population getPopulation() {
        return new EnglandPopulation();
    }

    @Override
    public Size getSize() {
        return new EnglandSize();
    }
}
