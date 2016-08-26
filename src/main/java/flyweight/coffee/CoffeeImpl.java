package flyweight.coffee;

public class CoffeeImpl implements Coffee {

    private final String type;
 
    public CoffeeImpl(String type) {
        this.type = type;
        System.out.println("CoffeeImpl type is: " + type);
    }
 
    public String getType() {
        return this.type;
    }
 
    @Override
    public void serveCoffee(CoffeeContext context) {
        System.out.println("Serving " + type + " to table " + context.getTableNumber());
    }
}
