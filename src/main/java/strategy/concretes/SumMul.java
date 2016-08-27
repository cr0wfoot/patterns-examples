package strategy.concretes;

import strategy.Strategy;

public class SumMul implements Strategy {
    
    @Override
    public double execute(double x, double y, double z) {
        return (x + y) * z;
    }
    
}
