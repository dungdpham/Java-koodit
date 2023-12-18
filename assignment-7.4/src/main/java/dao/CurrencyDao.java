package dao;

import datasource.*;
import jakarta.persistence.EntityManager;
import entity.*;

import java.util.List;

public class CurrencyDao {
    public List<String> getAllAbbreviations() {
        EntityManager em = MariaDbConnection.getInstance();

        List<String> abbreviations = em.createQuery("SELECT c.abbreviation FROM Currency c", String.class).getResultList();

        return abbreviations;
    }

    /*public double findConversionRate(String abbreviation) {
        EntityManager em = MariaDbConnection.getInstance();

        Currency currency = em.createQuery(
                "SELECT c FROM Currency c WHERE c.abbreviation = :abbreviation", Currency.class)
                .setParameter("abbreviation", abbreviation)
                .getSingleResult();

        return currency.getConversionRate();
    }*/

    public Currency findCurrencyByAbbreviation(String abbreviation) {
        EntityManager em = MariaDbConnection.getInstance();

        Currency currency = em.createQuery(
                        "SELECT c FROM Currency c WHERE c.abbreviation = :abbreviation", Currency.class)
                .setParameter("abbreviation", abbreviation)
                .getSingleResult();

        return currency;
    }

    public void persist(Currency currency) {
        EntityManager em = MariaDbConnection.getInstance();

        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }
}
