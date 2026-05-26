import java.util.Arrays;

class Originator {

    int[][] state = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    int turn = 0;

    Memento saveToMemento() {
        int[][] resState = new int[3][];
        for (int i = 0; i < 3; i++) {
            resState[i] = Arrays.copyOf(this.state[i], this.state[i].length);
        }
        return new Memento(resState, this.turn);
    }

    void restoreFromMemento(Memento m) {
        this.state = m.getSavedState();
        this.turn = m.getSavedTurn();
    }

    void considerTurn(int sign, int i, int j) {
        this.state[i][j] = sign;
        this.turn++;
    }

}