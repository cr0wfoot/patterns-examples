package flyweight.coffee;

public class CoffeeContext {
    
   private final int tableNumber;
 
   public CoffeeContext(int tableNumber) {
       this.tableNumber = tableNumber;
   }
 
   public int getTableNumber() {
       return this.tableNumber;
   }
}
