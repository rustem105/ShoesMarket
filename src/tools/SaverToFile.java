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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class SaverToFile implements keeping{

    public SaverToFile() {
    }
    

    @Override
    public void saveProducts(List<Product> productsArray) {
         FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("data/Products");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(productsArray);
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "", ex);
        }
    }

    @Override
    public List<Product> loadProducts() {
        List<Product> productsArray = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("data/Products");
            ois = new ObjectInputStream(fis);
            productsArray = (List<Product>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "", ex);
        }

        return productsArray;
    }

    @Override
    public void saveCustomers(List<Customer> customersArray) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("data/Customers");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(customersArray);
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "", ex);
        }
    }

    @Override
    public List<Customer> loadCustomers() {
        List<Customer> customersArray = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("data/Customers");
            ois = new ObjectInputStream(fis);
            customersArray = (List<Customer>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "", ex);
        }

        return customersArray;
    }

    @Override
    public void saveHistorys(List<History> historysArray) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("data/Historys");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(historysArray);
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "", ex);
        }
    }

    @Override
    public List<History> loadHistory() {
        List<History> historysArray = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("data/Historys");
            ois = new ObjectInputStream(fis);
            historysArray = (List<History>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "", ex);
        }

        return historysArray;
    }  
}
