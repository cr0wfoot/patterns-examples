package factorymethod;

import factorymethod.concretes.bananas.BananasCreator;
import factorymethod.concretes.fish.FishCreator;
import factorymethod.concretes.silk.SilkCreator;
import factorymethod.factory.Cargo;
import factorymethod.factory.Creator;

public class Run {

    public static void main(String[] args) {
        Creator[] creators = {new FishCreator(), new SilkCreator(), new BananasCreator()};

        for (Creator creator : creators) {
            Cargo product = creator.factoryMethod();
            System.out.println(product.getDescription());
        }
    }
}
