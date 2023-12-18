package view;

import controller.CurrencyConverterController;
import entity.Currency;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddCurrencyView extends Stage {

    private CurrencyConverterController controller;

    private Label nameLabel, abbreviationLabel, rateLabel;
    private TextField nameField, abbreviationField, rateField;
    private Button addButton;

    public AddCurrencyView(CurrencyConverterController controller) {
        this.controller = controller;
        initialize();
    }

    private void initialize() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        nameLabel = new Label("Currency Name:");
        abbreviationLabel = new Label("Abbreviation:");
        rateLabel = new Label("Conversion Rate:");

        nameField = new TextField();
        abbreviationField = new TextField();
        rateField = new TextField();

        addButton = new Button("Add Currency");
        addButton.setOnAction(event -> addCurrency());

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(abbreviationLabel, 0, 1);
        gridPane.add(abbreviationField, 1, 1);
        gridPane.add(rateLabel, 0, 2);
        gridPane.add(rateField, 1, 2);
        gridPane.add(addButton, 0, 3, 2, 1);

        Scene scene = new Scene(gridPane, 300, 150);
        setScene(scene);

        initModality(Modality.APPLICATION_MODAL);
        setTitle("Add Currency");
    }

    private void addCurrency() {
        try {
            String name = nameField.getText().trim();
            String abbreviation = abbreviationField.getText().trim();
            double rate = Double.parseDouble(rateField.getText().trim());

            Currency newCurrency = new Currency(name, abbreviation, rate);
            controller.addCurrency(newCurrency);

            // Close the window after adding the currency
            close();
        } catch (NumberFormatException e) {
            // Handle invalid rate input
            rateField.setText("Invalid conversion rate");
        }
    }
}
