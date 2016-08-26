package abstractfactory;

public class Run {

    public static void main(String[] args) {
        Handler handler = new Handler();

        handler.execute(1);
        handler.execute(2);
        handler.execute(3);
    }
}