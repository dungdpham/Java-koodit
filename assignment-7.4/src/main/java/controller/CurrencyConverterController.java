package controller;

import dao.CurrencyDao;
import dao.TransactionDao;
import entity.Currency;
import entity.Transaction;
import view.AddCurrencyView;
import view.CurrencyConverterView;

import java.util.List;

public class CurrencyConverterController {
    private CurrencyDao currencyDao = new CurrencyDao();
    private TransactionDao transactionDao = new TransactionDao();
    private CurrencyConverterView gui;

    public CurrencyConverterController(CurrencyConverterView gui) {
        this.gui = gui;
    }

    public List<String> getAbbreviations() {
        return currencyDao.getAllAbbreviations();
    }

    public void convert() {
        double amount = gui.getAmount();
        String sourceCurrencyAbbreviation = gui.getSourceCurrency();
        String targetCurrencyAbbreviation = gui.getTargetCurrency();

        Currency sourceCurrency = currencyDao.findCurrencyByAbbreviation(sourceCurrencyAbbreviation);
        Currency targetCurrency = currencyDao.findCurrencyByAbbreviation(targetCurrencyAbbreviation);

        double conversionRate = targetCurrency.getConversionRate() / sourceCurrency.getConversionRate();

        gui.setResult(amount * conversionRate);

        Transaction transaction = new Transaction(sourceCurrency, targetCurrency, amount);
        transactionDao.persist(transaction);
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
