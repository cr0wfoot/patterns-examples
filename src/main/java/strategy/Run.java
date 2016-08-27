package strategy;

import strategy.concretes.MulSum;
import strategy.concretes.MulSumMulSum;
import strategy.concretes.SumMul;

public class Run {

    public static void main(String[] args) {
        Context context = new Context();
        int x = 3, y = 5, z = 7;

        context.setStrategy(new MulSum());
        System.out.println(context.executeStrategy(x, y, z));

        context.setStrategy(new SumMul());
        System.out.println(context.executeStrategy(x, y, z));

        context.setStrategy(new MulSumMulSum());
        System.out.println(context.executeStrategy(x, y, z));
    }
}
