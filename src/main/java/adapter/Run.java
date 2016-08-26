package adapter;

public class Run {

    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();

        System.out.println("Initial values in Adaptee:  12.3  17.6  11.9");
        System.out.println(adapter.convertFirstNumber());
        System.out.println(adapter.convertSecondNumber());
        System.out.println(adapter.convertThirdNumber());
    }
}
