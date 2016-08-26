package flyweight.symbol;

public class Symbol {
    
    private final char value;
    
    public Symbol(char symbol) {
        this.value = symbol;
    }
    
    public char getValue() {
        return this.value;
    }
}
