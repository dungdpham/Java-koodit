package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import model.Dictionary;

public class DictionaryView extends Application {

    public void start(Stage stage) {
        Dictionary dictionary = new Dictionary();
        DictionaryController controller = new DictionaryController(dictionary);

        FlowPane root = createUI(controller);

        Scene scene = new Scene(root, 400, 200);
        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }

    private FlowPane createUI(DictionaryController controller) {
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setPadding(new Insets(10));

        Label wordLabel = new Label("Word:");
        TextField wordInput = new TextField();
        wordInput.setPrefWidth(80);

        Label meaningLabel = new Label("Meaning:");
        TextField meaningInput = new TextField();
        meaningInput.setPrefWidth(180);

        Button searchButton = new Button("Search");
        Button addButton = new Button("Add Word");

        Label resultLabel = new Label();

        flowPane.getChildren().addAll(wordLabel, wordInput, meaningLabel, meaningInput, searchButton, addButton, resultLabel);

        searchButton.setOnAction(event -> {
            String word = wordInput.getText().trim();
            if (!word.isEmpty()) {
                String meaning = controller.searchWord(word);
                resultLabel.setText(meaning != null ? meaning : "Word not found");
            } else {
                resultLabel.setText("Please enter a word");
            }
        });

        addButton.setOnAction(event -> {
            String word = wordInput.getText().trim();
            String meaning = meaningInput.getText().trim();
            if (!word.isEmpty() && !meaning.isEmpty()) {
                controller.addWord(word, meaning);
                resultLabel.setText("Word added to the dictionary");
            } else {
                resultLabel.setText("Please enter both word and meaning");
            }
        });

        return flowPane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}