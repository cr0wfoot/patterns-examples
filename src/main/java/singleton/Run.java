package singleton;

import singleton.simple.Singleton;

public class Run {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
}
