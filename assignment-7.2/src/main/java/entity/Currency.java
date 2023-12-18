package entity;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private String name, abbreviation;
    private double conversionRate;

    public Currency(String name, String abbreviation, double conversionRate) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.conversionRate = conversionRate;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }
}
