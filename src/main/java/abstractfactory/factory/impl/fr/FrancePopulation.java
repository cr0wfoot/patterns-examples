package abstractfactory.factory.impl.fr;

import abstractfactory.factory.Population;

public class FrancePopulation implements Population {
    
    @Override
    public int getPopulation() {
        return 63_460_000;
    }
}
