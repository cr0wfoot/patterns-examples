package builder.complex.flowers;

import builder.complex.FlowerBuilderAbstract;

public class Rose extends FlowerBuilderAbstract {

    @Override
    public void buildName() {
        flower.setName("Rose");
    }

    @Override
    public void buildPrice() {
        flower.setPrice(20.2);
    }

    @Override
    public void buildAge() {
        flower.setAge(3);
    }
}
