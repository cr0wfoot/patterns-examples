package adapter;

public class AdapterImpl implements Adapter {
    
    private Adaptee adaptee = new Adaptee();

    @Override
    public int convertFirstNumber() {
        return (int)adaptee.getFirstNumber();
    }

    @Override
    public int convertSecondNumber() {
        return (int)adaptee.getSecondNumber();
    }

    @Override
    public int convertThirdNumber() {
        return (int)adaptee.getThirdNumber();
    }
}
