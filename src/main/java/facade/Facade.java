package facade;

import facade.parts.Factorial;
import facade.parts.Resulter;
import facade.parts.Separator;

public class Facade {
    
    private Resulter resulter;
    private Separator separator;
    private Factorial factorial;
    
    public Facade() {
        this.resulter = new Resulter();
        this.separator = new Separator();
        this.factorial = new Factorial();
    }
    
    public void start(int value) {
        System.out.println(resulter.start());
        System.out.print(resulter.insert(value));
        System.out.println(resulter.execute(factorial.calculate(separator.divide(value))));
    }
}
