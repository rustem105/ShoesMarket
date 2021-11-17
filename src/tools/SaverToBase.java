/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import Interfaces.keeping;
import entity.Customer;
import entity.History;
import entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class SaverToBase implements keeping{
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ShoesMarketPU");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();


    

    @Override
    public void saveProducts(List<Product> productsArray) {
         tx.begin();
            for (int i = 0; i < productsArray.size(); i++) {
                if (productsArray.get(i).getId() == null) {
                    em.persist(productsArray.get(i));
                }
            }
        tx.commit();
    }

    @Override
    public List<Product> loadProducts() {
        List<Product> productsArray = null;
        try {
            productsArray = em.createQuery("SELECT product FROM Product product").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
        return productsArray;
    }

    @Override
    public void saveCustomers(List<Customer> customersArray) {
        tx.begin();
            for (int i = 0; i < customersArray.size(); i++) {
                if (customersArray.get(i).getId() == null) {
                    em.persist(customersArray.get(i));
                }
            }
        tx.commit();
    }

    @Override
    public List<Customer> loadCustomers() {
         List<Customer> customersArray = null;
        try {
            customersArray = em.createQuery("SELECT customer FROM Customer customer").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
        return customersArray;
    }

    @Override
    public void saveHistorys(List<History> historysArray) {
        tx.begin();
            for (int i = 0; i < historysArray.size(); i++) {
                if (historysArray.get(i).getId() == null) {
                    em.persist(historysArray.get(i));
                }
            }
        tx.commit();
    }

    @Override
    public List<History> loadHistory() {
        List<History> historysArray = null;
        try {
            historysArray = em.createQuery("SELECT history FROM History history").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
        return historysArray;
    }
    
}
