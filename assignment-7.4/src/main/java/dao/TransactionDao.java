// dao/TransactionDao.java
package dao;

import datasource.MariaDbConnection;
import entity.Transaction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class TransactionDao {
    public void persist(Transaction transaction) {
        EntityManager em = MariaDbConnection.getInstance();

        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();
    }
}

