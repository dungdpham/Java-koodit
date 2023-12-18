package controller;

import dao.CurrencyDao;
import entity.Currency;
import view.CurrencyConverterView;

import java.sql.SQLException;
import java.util.ArrayList;

public class CurrencyConverterController {
    private CurrencyDao currencyDao = new CurrencyDao();
    private CurrencyConverterView gui;

    public CurrencyConverterController(CurrencyConverterView gui) {
        this.gui = gui;
    }

    public ArrayList<String> getAbbreviations() {
        return currencyDao.getAllAbbreviations();
    }

    public void convert() {
        double amount = gui.getAmount();
        String sourceCurrency = gui.getSourceCurrency();
        String targetCurrency = gui.getTargetCurrency();

        double sourceRate = currencyDao.getConversionRate(sourceCurrency);
        double targetRate = currencyDao.getConversionRate(targetCurrency);
        double conversionRate = targetRate / sourceRate;

        gui.setResult(amount * conversionRate);
    }

    public static void main(String[] args) {
        CurrencyConverterView.launch(CurrencyConverterView.class);
    }
}
