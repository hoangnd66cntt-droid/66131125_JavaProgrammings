import java.util.*;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class Test extends Application {

    private Originator list;
    private Caretaker caretaker;
    private Scene scene;
    private GridPane middle;
    private HBox[] hb;
    private Button[][] buttons;
    private MenuItem newgamebutton;
    private MenuItem back;
    private MenuItem exitbutton;
    private Label l;
    private ArrayList<IntPair> ij;

    private void initWindow() {
        BorderPane bp = new BorderPane();
        scene = new Scene(bp);
        middle = new GridPane();
        GridPane bottom = new GridPane();
        hb = new HBox[3];
        MenuBar topbar = new MenuBar();
        Menu newgame = new Menu("New Game");
        newgamebutton = new MenuItem("New Game");
        back = new MenuItem("Back");
        exitbutton = new MenuItem("EXIT");
        l = new Label("X TURN");
        ij = new ArrayList<>();
        newgamebutton.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        back.setAccelerator(KeyCombination.keyCombination("Z"));
        exitbutton.setAccelerator(KeyCombination.keyCombination("Alt+F4"));
        newgame.getItems().addAll(newgamebutton, back, exitbutton);
        topbar.getMenus().addAll(newgame);
        l.setAlignment(Pos.CENTER);
        bottom.getChildren().add(l);
        middle.setAlignment(Pos.CENTER);
        bottom.setAlignment(Pos.CENTER);
        bottom.setTranslateY(-10);
        bp.setCenter(middle);
        bp.setTop(topbar);
        bp.setBottom(bottom);
    }

    private void initButtons() {
        buttons = new Button[3][3];
        for (int i = 0; i < 3; i++) {
            hb[i] = new HBox();
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new Button("");
                buttons[i][j].setMinSize(150, 150);
                int finalI = i;
                int finalJ = j;
                buttons[i][j].setOnAction(event -> {
                    caretaker.addMemento(list.saveToMemento());
                    list.considerTurn(1, finalI, finalJ);
                    buttons[finalI][finalJ].setText("X");
                    buttons[finalI][finalJ].setDisable(true);
                    isWinner(1, finalI, finalJ);
                    if (!middle.isDisable()) move();
                });
                hb[i].getChildren().add(buttons[i][j]);
            }
            middle.add(hb[i], 0, i);
        }
    }

    private void newGame() {
        caretaker = new Caretaker();
        list = new Originator();
        ij.clear();
        back.setDisable(true);
        middle.setDisable(false);
        l.setText("X TURN");
        for (Button[] button : buttons) {
            for (Button b : button) {
                b.setText("");
                b.setDisable(false);
            }
        }
    }

    private void move() {
        Random r = new Random();
        while (true) {
            int i = r.nextInt(3), j = r.nextInt(3);
            if (ij.contains(new IntPair(i, j)) || list.state[i][j] > 0) continue;
            else ij.add(new IntPair(i, j));
            list.considerTurn(2, i, j);
            back.setDisable(false);
            buttons[i][j].setText("O");
            buttons[i][j].setDisable(true);
            isWinner(2, i, j);
            break;
        }
    }

    private void isWinner(int sign, int x, int y) {
        boolean v = true, h = true, d = true, ad = true;
        for (int i = 0; i < 3; i++) {
            if (v) {
                v = list.state[i][y] == sign;
            }
            if (h) {
                h = list.state[x][i] == sign;
            }
            if (d) {
                d = list.state[i][i] == sign;
            }
            if (ad) {
                ad = list.state[i][2 - i] == sign;
            }
        }
        if (v || h || d || ad) {
            l.setText(sign == 1 ? "X WINS" : "O WINS");
            middle.setDisable(true);
        } else isDraw();
    }

    private void isDraw() {
        if (list.turn == 9) {
            l.setText("DRAW");
            middle.setDisable(true);
        }
    }


    private void rewind() {
        list.restoreFromMemento(caretaker.getLastMemento());
        ij.remove(ij.size() - 1);
        middle.setDisable(false);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setDisable(list.state[i][j] != 0);
                buttons[i][j].setText(list.state[i][j] == 1 ? "X" : list.state[i][j] == 2 ? "O" : "");
            }
        }
        if (caretaker.savedStates.isEmpty()) {
            back.setDisable(true);
        }
        if (list.turn % 2 == 0) {
            l.setText("X TURN");
        } else {
            l.setText("O TURN");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        initWindow();
        initButtons();
        newGame();
        newgamebutton.setOnAction(event -> newGame());
        back.setOnAction(event -> rewind());
        exitbutton.setOnAction(event -> primaryStage.close());
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(600);
        primaryStage.setMaxHeight(600);
        primaryStage.setMaxWidth(600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
