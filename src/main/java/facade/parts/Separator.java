package facade.parts;

public class Separator {
    
    public int[] divide(int value) {
        int[] values = new int[value];
        for (int i = 0; i < value; i++)
            values[i] = i + 1;
        return values;
    }
}
