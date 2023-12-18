package controller;

import model.CurrencyConverter;
import view.CurrencyConverterView;

public class CurrencyConverterController {
    private CurrencyConverter model = new CurrencyConverter();
    private CurrencyConverterView gui;

    public CurrencyConverterController(CurrencyConverterView gui) {
        this.gui = gui;
    }

    public void convert() {
        double amount = gui.getAmount();
        String sourceCurrency = gui.getSourceCurrency();
        String targetCurrency = gui.getTargetCurrency();

        double conversionRate = model.getConversionRate(sourceCurrency, targetCurrency);
        gui.setResult(amount * conversionRate);
    }

    public static void main(String[] args) {
        CurrencyConverterView.launch(CurrencyConverterView.class);
    }
}
