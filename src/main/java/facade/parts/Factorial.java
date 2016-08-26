package facade.parts;

public class Factorial {
    
    public int calculate(int[] values) {
        int result = 1;
        for (int i = 0; i < values.length; i++)
            result *= values[i]; 
        return result;
    }
}
