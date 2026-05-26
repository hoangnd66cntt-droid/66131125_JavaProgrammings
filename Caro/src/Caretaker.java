import java.util.ArrayList;

class Caretaker {

    ArrayList<Memento> savedStates = new ArrayList<>();

    void addMemento(Memento m) {
        savedStates.add(m);
    }

    Memento getLastMemento() {
        Memento res = savedStates.get(savedStates.size() - 1);
        savedStates.remove(savedStates.size() - 1);
        return res;
    }

}