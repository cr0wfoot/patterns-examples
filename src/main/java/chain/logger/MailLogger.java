package chain.logger;

public class MailLogger extends LoggerAbstract {
    
    public MailLogger(int mask) {
        this.mask = mask;
    }
    
    @Override
    protected void writeMessage(String msg) {
        System.out.println("Send mail: " + msg);
    }
}
