package decorator.components;

import decorator.Component;
import decorator.DecoratorAbstract;

public class ThirdComponent extends DecoratorAbstract {
    
    public ThirdComponent(Component component) {
        super(component);
    }
    
    @Override
    public void doOperation(int value) {
        value *= 3;
        super.doOperation(value);
    }
    
    @Override
    public void currentComponent() {
        System.out.println("component 3");
    }
}
