package view;

import controller.CurrencyConverterController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CurrencyConverterView extends Application {

    private CurrencyConverterController controller;

    Label amountLabel, sourceLabel, targetLabel, resultLabel;
    TextField amountField, resultField;
    ChoiceBox<String> sourceCurrencyChoice, targetCurrencyChoice;
    Button convertButton;

    public void start(Stage stage) {
        GridPane root = createUI(controller);

        Scene scene = new Scene(root, 400, 200);
        scene.getStylesheets().add("styles.css");

        stage.setTitle("Currency Converter");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane createUI(CurrencyConverterController controller) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        amountLabel = new Label("Amount:");
        amountField = new TextField();
        amountField.setPromptText("Enter amount");

        ObservableList<String> currencyAbbreviation = FXCollections.observableArrayList(controller.getAbbreviations());

        sourceLabel = new Label("Source Currency:");
        sourceCurrencyChoice = new ChoiceBox<>();
        sourceCurrencyChoice.setItems(currencyAbbreviation);

        targetLabel = new Label("Target Currency:");
        targetCurrencyChoice = new ChoiceBox<>();
        targetCurrencyChoice.setItems(currencyAbbreviation);

        resultLabel = new Label("Converted Amount:");
        resultField = new TextField();
        resultField.setEditable(false);

        convertButton = new Button("Convert");
        convertButton.setOnAction(event -> {
            try {
                controller.convert();
            } catch (NumberFormatException e) {
                resultField.setText("Invalid amount");
            }
        });

        gridPane.add(amountLabel, 0, 0);
        gridPane.add(amountField, 1, 0);
        gridPane.add(sourceLabel, 0, 1);
        gridPane.add(sourceCurrencyChoice, 1, 1);
        gridPane.add(targetLabel, 0, 2);
        gridPane.add(targetCurrencyChoice, 1, 2);
        gridPane.add(resultLabel, 0, 3);
        gridPane.add(resultField, 1, 3);
        gridPane.add(convertButton, 0, 4, 2, 1);

        return gridPane;
    }

    public void init() {
        controller = new CurrencyConverterController(this);
    }

    public double getAmount() {
        return Double.parseDouble(amountField.getText().trim());
    }

    public String getSourceCurrency() {
        return sourceCurrencyChoice.getValue();
    }

    public String getTargetCurrency() {
        return targetCurrencyChoice.getValue();
    }

    public void setResult(double result) {
        resultField.setText(String.format("%.2f", result));
    }

    public void setMessage(String message) { resultField.setText(message); }
}
