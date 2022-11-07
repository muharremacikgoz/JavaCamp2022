/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.week3lesson_oopwithnlayeredapp.business;

import com.week3lesson_oopwithnlayeredapp.core.logging.Logger;
import com.week3lesson_oopwithnlayeredapp.dataAccess.ProductDao;
import com.week3lesson_oopwithnlayeredapp.entities.Product;
import java.util.List;

/**
 *
 * @author Muharrem AÇIKGÖZ
 */
public class ProductManager {

    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // İş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }

        productDao.add(product);

        for (Logger logger : loggers) { // [db,mail]
            logger.log(product.getName());
        }
    }
}
