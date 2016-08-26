package builder.complex;

public class Florist {
    
    private FlowerBuilderAbstract flowerBuilder;
    
    public void setFlowerBuilder(FlowerBuilderAbstract flowerBuilder) {
        this.flowerBuilder = flowerBuilder;
    }
    
    public Flower getFlower() {
        return flowerBuilder.getFlower();
    }
    
    public void buildFlower() {
        flowerBuilder.createFlower();
        flowerBuilder.buildName();
        flowerBuilder.buildPrice();
        flowerBuilder.buildAge();
    }
}
