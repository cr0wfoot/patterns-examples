package proxy;

public class Calculator implements Operations {

    @Override
    public double mulSum(double x, double y, double z) {
        return x * y + z;
    }

    @Override
    public double sumMul(double x, double y, double z) {
        return (x + y) * z;
    }

    @Override
    public double mulSumMulSum(double x, double y, double z) {
        return x * x + y * z + z;
    }
}
