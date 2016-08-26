package builder.simple;

public class SelectorBuilder {
    
    private final int id;
    private final String name;
    private final int years;
    private final String position;
    private final double salary;
    
    public static class Builder {
        
        private final int id;
        
        private String name = "unknown";
        private int years = 0;
        private String position = "unknown";
        private double salary = 0.0;
        
        public Builder(int id) {
            this.id = id;
        }
        
        public Builder name(String val) {
            this.name = val;
            return this;
        }
        
        public Builder years(int val) {
            this.years = val;
            return this;
        }
        
        public Builder position(String val) {
            this.position = val;
            return this;
        }
        
        public Builder salary(double val) {
            this.salary = val;
            return this;
        }
        
        public SelectorBuilder build() {
            return new SelectorBuilder(this);
        }
    }
    
    private SelectorBuilder(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.years = builder.years;
        this.position = builder.position;
        this.salary = builder.salary;
    }
    
    @Override
    public String toString() {
        return "" + id + " " + name + " " + years +
                " " + position + " " + salary;
    }
}
