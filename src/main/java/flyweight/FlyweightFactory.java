package flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    
    private HashMap<String, Symbol> symbols = new HashMap<>();
 
    public Symbol getSymbol(String stringValue) {
        Symbol symbol = symbols.get(stringValue);
        if (symbol == null) {
            symbol = new Symbol(stringValue.charAt(0));
            symbols.put(stringValue, symbol);
        }
        return symbol;
    }
 
    public int getSymbolsCount() {
        return symbols.size();
    }
}
