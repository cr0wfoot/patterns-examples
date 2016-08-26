package builder.complex;

public abstract class FlowerBuilderAbstract {
    
    protected Flower flower;
    
    public Flower getFlower() {
        return this.flower;
    }
    
    public void createFlower() {
        this.flower = new Flower();
    }
    
    public abstract void buildName();
    public abstract void buildPrice();
    public abstract void buildAge();
}
