/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.week3lesson_oopwithnlayeredapp;

import com.week3lesson_oopwithnlayeredapp.business.ProductManager;
import com.week3lesson_oopwithnlayeredapp.core.logging.DatabaseLogger;
import com.week3lesson_oopwithnlayeredapp.core.logging.FileLogger;
import com.week3lesson_oopwithnlayeredapp.core.logging.Logger;
import com.week3lesson_oopwithnlayeredapp.core.logging.MailLogger;
import com.week3lesson_oopwithnlayeredapp.dataAccess.HibernateProductDao;
import com.week3lesson_oopwithnlayeredapp.dataAccess.JdbcProductDao;
import com.week3lesson_oopwithnlayeredapp.entities.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class Week3Lesson_OOPWithNLayeredApp {

    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "IPhone XR", 10000);
        List<Logger> loggers =new ArrayList<Logger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLogger());
        loggers.add(new FileLogger());
        
        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);
    }
}
