package abstractfactory;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.Name;
import abstractfactory.factory.Population;
import abstractfactory.factory.Size;
import abstractfactory.factory.impl.eng.EnglandFactory;
import abstractfactory.factory.impl.fr.FranceFactory;
import abstractfactory.factory.impl.it.ItalyFactory;

public class Handler {

    private AbstractFactory factory = null;

    public void execute(int factoryNumber) {
        setFactory(factoryNumber);
        execute();
    }

    private void setFactory(int factoryNumber) {
        if (factoryNumber == 1)
            factory = new EnglandFactory();
        else if (factoryNumber == 2)
            factory = new FranceFactory();
        else if (factoryNumber == 3)
            factory = new ItalyFactory();
    }

    private void execute() {
        if (factory != null) {
            Name name = factory.getName();
            System.out.print("Country: " + name.getName());

            Population population = factory.getPopulation();
            System.out.print(", population: " + population.getPopulation());

            Size size = factory.getSize();
            System.out.println(", size: " + size.getSize());
        } else
            System.out.println("Not supported yet!");
    }
}
