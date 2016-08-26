package chain.logger;

public abstract class LoggerAbstract {
    
    public static int ERROR = 3;
    public static int MAIL = 5;
    public static int DEBUG = 7;
    protected int mask;
 
    protected LoggerAbstract next;
 
    public LoggerAbstract setNext(LoggerAbstract logger) {
        next = logger;
        return logger;
    }
 
    public void message(String msg, int priority) {
        if (priority <= mask)
            writeMessage(msg);
        if (next != null)
            next.message(msg, priority);
    }
 
    protected abstract void writeMessage(String msg);
}
