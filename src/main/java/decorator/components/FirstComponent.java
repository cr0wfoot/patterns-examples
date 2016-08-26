package decorator.components;

import decorator.Component;
import decorator.DecoratorAbstract;

public class FirstComponent extends DecoratorAbstract {
    
    public FirstComponent(Component component) {
        super(component);
    }
    
    @Override
    public void doOperation(int value) {
        value *= value;
        super.doOperation(value);
    }
    
    @Override
    public void currentComponent() {
        System.out.println("component 1");
    }
}
