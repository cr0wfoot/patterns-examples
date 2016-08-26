package builder.complex.flowers;

import builder.complex.FlowerBuilderAbstract;

public class Camomile extends FlowerBuilderAbstract {

    @Override
    public void buildName() {
        flower.setName("Camomile");
    }

    @Override
    public void buildPrice() {
        flower.setPrice(7.5);
    }

    @Override
    public void buildAge() {
        flower.setAge(2);
    }
}
