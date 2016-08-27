package singleton.simple;

public class Singleton {
    
    private static final String ONE_FIELD = "\nExecuted only one time, and has only one field with this string.";
    private Singleton() {}
    
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }
    
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    
    @Override
    public String toString() {
        return Singleton.class.getName() + ", hashCode: " + 
               Singleton.class.hashCode() + ONE_FIELD;
    }
}
