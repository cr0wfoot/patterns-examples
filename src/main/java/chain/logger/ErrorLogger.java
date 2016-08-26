package chain.logger;

public class ErrorLogger extends LoggerAbstract {
    
    public ErrorLogger(int mask) {
        this.mask = mask;
    }
    
    @Override
    protected void writeMessage(String msg) {
        System.out.println("Error: " + msg);
    }
}
