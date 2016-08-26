package builder.complex;

public class Flower {
    
    private String name = "";
    private double price = 0;
    private int age = 0;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "\nName: " + this.name + "\nPrice: " + this.price + 
               " hrn\nAge: " + this.age + " days";
    }
}
