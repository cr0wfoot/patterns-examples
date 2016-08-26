package flyweight.coffee;

import java.util.HashMap;

public class CoffeeFactory {
    
    private HashMap<String, CoffeeImpl> coffeeTypes = new HashMap<>();
 
    public CoffeeImpl getCoffee(String type) {
        CoffeeImpl coffee = coffeeTypes.get(type);
        if (coffee == null) {
            coffee = new CoffeeImpl(type);
            coffeeTypes.put(type, coffee);
        }
        return coffee;
    }
 
    public int getTypesCount() {
        return coffeeTypes.size();
    }
}
