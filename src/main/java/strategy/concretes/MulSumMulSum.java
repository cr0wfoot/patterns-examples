package strategy.concretes;

import strategy.Strategy;

public class MulSumMulSum implements Strategy {
    
    @Override
    public double execute(double x, double y, double z) {
        return x * x + y * z + z;
    }
}
