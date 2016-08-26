package adapter;

public class Run {

    public static void main(String[] args) {
        adapter.simple.Adapter simple = new adapter.simple.AdapterImpl();

        System.out.println("Initial values in Adaptee:  12.3  17.6  11.9");
        System.out.println(simple.convertFirstNumber());
        System.out.println(simple.convertSecondNumber());
        System.out.println(simple.convertThirdNumber());

        adapter.inheritance.Adapter inheritance = new adapter.inheritance.AdapterImpl();

        System.out.println("Initial values in Adaptee:  12.3  17.6  11.9");
        System.out.println(inheritance.convertFirstNumber());
        System.out.println(inheritance.convertSecondNumber());
        System.out.println(inheritance.convertThirdNumber());
    }
}
