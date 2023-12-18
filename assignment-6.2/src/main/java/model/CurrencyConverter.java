package model;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> conversionRates;

    public CurrencyConverter() {
        // Hardcoded conversion rates (to USD)
        conversionRates = new HashMap<>();
        conversionRates.put("USD", 1.0);
        conversionRates.put("EUR", 0.90);
        conversionRates.put("GBP", 0.79);
        conversionRates.put("CAD", 1.34);
        conversionRates.put("AUD", 1.49);
        conversionRates.put("HKD", 7.80);
    }

    public double getConversionRate(String sourceCurrency, String targetCurrency) {
        double sourceToUSD = conversionRates.get(sourceCurrency);
        double targetToUSD = conversionRates.get(targetCurrency);
        return targetToUSD / sourceToUSD;
    }
}
