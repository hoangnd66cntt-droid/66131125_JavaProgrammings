class Memento {

    private int[][] state;
    private int turn;

    Memento(int[][] stateToSave, int turnToSave) {
        this.state = stateToSave;
        this.turn = turnToSave;
    }

    int[][] getSavedState() {
        return state;
    }

    int getSavedTurn() {
        return turn;
    }

}