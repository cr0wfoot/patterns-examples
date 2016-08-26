package builder.complex.flowers;

import builder.complex.FlowerBuilderAbstract;

public class Daisy extends FlowerBuilderAbstract {

    @Override
    public void buildName() {
        flower.setName("Daisy");
    }

    @Override
    public void buildPrice() {
        flower.setPrice(12.4);
    }

    @Override
    public void buildAge() {
        flower.setAge(1);
    }
}
