/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entity.Customer;
import entity.History;
import entity.Product;
import java.util.List;

/**
 *
 * @author pupil
 */
public interface keeping {
    public void saveProducts(List<Product> productsArray);
    public List<Product> loadProducts();

    public void saveCustomers(List<Customer> customersArray);
    public List<Customer> loadCustomers();

    public void saveHistorys(List<History> historysArray);
    public List<History> loadHistory();
}
