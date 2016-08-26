package proxy;

public class ProxyCalculator implements Operations {

    private Calculator calculator;
    
    @Override
    public double mulSum(double x, double y, double z) {
        if (calculator == null) calculator = new Calculator();
        return calculator.mulSum(x, y, z) + x;
    }

    @Override
    public double sumMul(double x, double y, double z) {
        if (calculator == null) calculator = new Calculator();
        return calculator.sumMul(x, y, z) + y;
    }

    @Override
    public double mulSumMulSum(double x, double y, double z) {
        if (calculator == null) calculator = new Calculator();
        return calculator.mulSumMulSum(x, y, z) + z;
    }
}
