package strategy;

public class Context {
    
    private Strategy strategy;
    
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public double executeStrategy(double x, double y, double z) {
        return strategy.execute(x, y, z);
    }
}
