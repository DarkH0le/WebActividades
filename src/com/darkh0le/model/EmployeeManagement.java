package com.darkh0le.model;

import com.darkh0le.MessageEntity;
import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;


/**
 * @author $darkh0le
 */
public class EmployeeManagement {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    private static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void getAllTables() throws Exception {

        Transaction tx = null;

        try (Session session = getSession()) {
            //Save point
            tx = session.beginTransaction();

            //TODO: do something
            MessageEntity msg = new MessageEntity();
            msg.setMessage("Hola2");
            session.save(msg);

            //Show all entities
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    o = (MessageEntity) o;
                    System.out.println(o.toString());
                }
            }

            //Commit transaction if not failure
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
            }
        }
    }
}