package decorator;

public abstract class DecoratorAbstract implements Component {
    
    protected Component component;
    
    public DecoratorAbstract(Component component) {
        this.component = component;
    }
    
    @Override
    public void doOperation(int value) {
        component.doOperation(value);
    }
    
    public void currentComponent() {
        System.out.println("none");
    }
}
