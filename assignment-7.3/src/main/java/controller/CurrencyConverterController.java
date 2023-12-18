package controller;

import dao.CurrencyDao;
import entity.Currency;
import view.AddCurrencyView;
import view.CurrencyConverterView;

import java.util.List;

public class CurrencyConverterController {
    private CurrencyDao currencyDao = new CurrencyDao();
    private CurrencyConverterView gui;

    public CurrencyConverterController(CurrencyConverterView gui) {
        this.gui = gui;
    }

    public List<String> getAbbreviations() {
        return currencyDao.getAllAbbreviations();
    }

    public void convert() {
        double amount = gui.getAmount();
        String sourceCurrency = gui.getSourceCurrency();
        String targetCurrency = gui.getTargetCurrency();

        double sourceRate = currencyDao.findConversionRate(sourceCurrency);
        double targetRate = currencyDao.findConversionRate(targetCurrency);
        double conversionRate = targetRate / sourceRate;

        gui.setResult(amount * conversionRate);
    }

    public void openAddCurrencyWindow() {
        AddCurrencyView addCurrencyView = new AddCurrencyView(this);
        addCurrencyView.showAndWait();

        gui.updateCurrencyList();
    }

    public void addCurrency(Currency currency) {
        currencyDao.persist(currency);
    }

    public static void main(String[] args) {
        CurrencyConverterView.launch(CurrencyConverterView.class);
    }
}
