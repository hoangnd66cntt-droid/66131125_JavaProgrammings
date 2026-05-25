package HelloFx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class PokerFX extends Application {

    Label cards = new Label("?");
    Label result = new Label("Nhấn nút để phát bài");

    String[] rank = {
            "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "J", "Q", "K", "A"
    };

    Random rd = new Random();

    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button();

        btn.setText("Phát bài");

        btn.setOnAction(e -> {

            // random 5 lá
            String c1 = rank[rd.nextInt(13)];
            String c2 = rank[rd.nextInt(13)];
            String c3 = rank[rd.nextInt(13)];
            String c4 = rank[rd.nextInt(13)];
            String c5 = rank[rd.nextInt(13)];

            // hiện bài
            cards.setText(c1 + "  " + c2 + "  " + c3 + "  " + c4 + "  " + c5);

            // kiểm tra
            if(c1.equals(c2) || c1.equals(c3) || c1.equals(c4) || c1.equals(c5)) {

                result.setText("One Pair");
            }
            else {

                result.setText("High Card");
            }
        });

        VBox root = new VBox(20);

        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(cards, btn, result);

        Scene scene = new Scene(root, 500, 300);

        primaryStage.setTitle("Poker Game");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}