package adapter.inheritance;

public class AdapterImpl extends Adaptee implements Adapter {

    @Override
    public int convertFirstNumber() {
        return (int)getFirstNumber();
    }

    @Override
    public int convertSecondNumber() {
        return (int)getSecondNumber();
    }

    @Override
    public int convertThirdNumber() {
        return (int)getThirdNumber();
    }
}
