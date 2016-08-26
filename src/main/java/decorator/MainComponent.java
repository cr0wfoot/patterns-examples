package decorator;

public class MainComponent implements Component {

    @Override
    public void doOperation(int value) {
        System.out.println("result = " + value);
    }
}
