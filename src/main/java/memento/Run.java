package memento;

public class Run {

    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        Caretaker caretaker = new Caretaker();

        transaction.setState("done Step 1");
        caretaker.setMemento(transaction.saveState());
        System.out.println(transaction.getState());

        transaction.setState("done Step 2 with error");
        System.out.println(transaction.getState());

        transaction.backupState(caretaker.getMemento());
        System.out.println(transaction.getState());
    }
}
