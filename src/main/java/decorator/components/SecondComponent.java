package decorator.components;

import decorator.Component;
import decorator.DecoratorAbstract;

public class SecondComponent extends DecoratorAbstract {
    
    public SecondComponent(Component component) {
        super(component);
    }
    
    @Override
    public void doOperation(int value) {
        value += value;
        super.doOperation(value);
    }
    
    @Override
    public void currentComponent() {
        System.out.println("component 2");
    }
}
