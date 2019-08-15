package model;

import entity.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductModel {
    private static Logger LOGGER = Logger.getLogger(ProductModel.class.getSimpleName());

    public void save(Product product){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(product);
            transaction.commit();
            LOGGER.log(Level.INFO, String.format("Save student success with rollNumber %s", product.getName()));
        }catch (Exception ex){
            if (transaction != null){
                transaction.rollback();
            }
            LOGGER.log(Level.SEVERE, String.format("Save student error, stack trace"), ex);
        }
    }
}
