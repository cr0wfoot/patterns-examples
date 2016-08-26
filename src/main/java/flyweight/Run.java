package flyweight;

import flyweight.symbol.FlyweightFactory;

public class Run {

    public static void main(String[] args) {
        FlyweightFactory flyweight = new FlyweightFactory();

        System.out.println(flyweight.getSymbol("a"));
        System.out.println(flyweight.getSymbol("b"));
        System.out.println(flyweight.getSymbol("a"));
        System.out.println(flyweight.getSymbol("A"));
        System.out.println(flyweight.getSymbol("A"));
        System.out.println(flyweight.getSymbol("b"));
        System.out.println(flyweight.getSymbol(","));
        System.out.println(flyweight.getSymbolsCount() + " unique symbols");
    }
}
