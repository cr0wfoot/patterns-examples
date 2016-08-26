package decorator;

import decorator.components.FirstComponent;
import decorator.components.SecondComponent;
import decorator.components.ThirdComponent;

public class Run {

    public static void main(String[] args) {
        int value = 5;
        System.out.println("Initial value = " + value +
                "\ncomponent 1: x*x\ncomponent 2: x*2\ncomponent 3: x*3" +
                "\ncomponent main: prints result\n");

        DecoratorAbstract decorator = new FirstComponent(new SecondComponent(new ThirdComponent(new MainComponent())));
        decorator.doOperation(value);

        System.out.print("Current component: ");
        decorator.currentComponent();
    }
}
