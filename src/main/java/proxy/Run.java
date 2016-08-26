package proxy;

public class Run {

    public static void main(String[] args) {
        Operations proxyCalculator = new ProxyCalculator();
        int x = 3, y = 5, z = 7;

        System.out.println(proxyCalculator.mulSum(x, y, z));
        System.out.println(proxyCalculator.sumMul(x, y, z));
        System.out.println(proxyCalculator.mulSumMulSum(x, y, z));
    }
}
