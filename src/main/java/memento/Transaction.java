package memento;

public class Transaction {
    
    private String state;
 
    public void setState(String state) {
        this.state = state;
    }
 
    public String getState() {
        return state;
    }
 
    public Memento saveState() {
        return new Memento(state);
    }
 
    public void backupState(Memento memento) {
        this.state = memento.getState();
    }
}
