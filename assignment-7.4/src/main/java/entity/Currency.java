package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "currency")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "abbreviation")
    private String abbreviation;

    @Column(name = "conversion_rate")
    private double conversionRate;

    @OneToMany(mappedBy = "sourceCurrency")
    private List<Transaction> sourceTransactions;

    @OneToMany(mappedBy = "targetCurrency")
    private List<Transaction> targetTransactions;

    public Currency(String name, String abbreviation, double conversionRate) {
        super();
        this.name = name;
        this.abbreviation = abbreviation;
        this.conversionRate = conversionRate;
    }

    public Currency() {
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
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
