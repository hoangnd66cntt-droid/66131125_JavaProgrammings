package PokerFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class PokerFx extends Application {

    @Override
    public void start(Stage stage) {

        Label text = new Label("Poker Game");

        Button btn = new Button("Phát bài");

        btn.setOnAction(e -> {
            text.setText("Bạn nhận được: A♠");
        });

        VBox root = new VBox(20);

        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(text, btn);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Poker");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}