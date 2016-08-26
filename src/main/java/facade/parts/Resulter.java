package facade.parts;

public class Resulter {
    
    public String start() {
        return "Calculate N!\n";
    }
    
    public String insert(int value) {
        return "N = " + value + "\n" + value + "! =";
    }
    
    public String execute(int result) {
        return " " + result;
    }
}
