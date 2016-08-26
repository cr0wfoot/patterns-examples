package factorymethod;

import factorymethod.inheritance.concretes.bananas.BananasCreator;
import factorymethod.inheritance.concretes.fish.FishCreator;
import factorymethod.inheritance.concretes.silk.SilkCreator;
import factorymethod.inheritance.factory.Cargo;
import factorymethod.inheritance.factory.Creator;

public class Run {

    public static void main(String[] args) {
        Creator[] creators = {new FishCreator(), new SilkCreator(), new BananasCreator()};

        for (Creator creator : creators) {
            Cargo product = creator.factoryMethod();
            System.out.println(product.getDescription());
        }
    }
}
