package util;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            ourSessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }catch (Throwable ex){
            throw new ExceptionInInitializerError();
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(String[] args) throws Exception{
        final Session session = getSession();
        Transaction transaction = null;
        try{

            transaction = session.beginTransaction();

            transaction.commit();
        }catch (Exception ex){
            transaction.rollback();
        }finally {
            session.close();
        }
    }

}
