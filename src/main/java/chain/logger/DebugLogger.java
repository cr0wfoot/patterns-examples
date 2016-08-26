package chain.logger;

public class DebugLogger extends LoggerAbstract {
    
    public DebugLogger(int mask) {
        this.mask = mask;
    }
    
    @Override
    protected void writeMessage(String msg) {
        System.out.println("Debug: " + msg);
    }
}
