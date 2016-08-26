package factorymethod;

import factorymethod.implementation.factory.CreatorImpl;
import factorymethod.implementation.factory.Tank;
import factorymethod.inheritance.concretes.bananas.BananasCreator;
import factorymethod.inheritance.concretes.fish.FishCreator;
import factorymethod.inheritance.concretes.silk.SilkCreator;
import factorymethod.inheritance.factory.Cargo;
import factorymethod.inheritance.factory.Creator;

public class Run {

    public static void main(String[] args) {
        demoInheritance();
        demoImplementation();
    }

    private static void demoInheritance() {
        Creator[] creators = {new FishCreator(), new SilkCreator(), new BananasCreator()};

        for (Creator creator : creators) {
            Cargo product = creator.factoryMethod();
            System.out.println(product.getDescription());
        }
    }

    private static void demoImplementation() {
        factorymethod.implementation.factory.Creator creator = new CreatorImpl();
        Tank tank;

        tank = creator.getTank("T-34");
        System.out.println(tank.getDescription());

        tank = creator.getTank("T-70");
        System.out.println(tank.getDescription());

        tank = creator.getTank("T-100");
        System.out.println(tank.getDescription());
    }
}
