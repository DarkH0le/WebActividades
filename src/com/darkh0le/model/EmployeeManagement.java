package com.darkh0le.model;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


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


    private static void reportAllTables(Session session) {
        final Metamodel metamodel = session.getSessionFactory().getMetamodel();
        for (EntityType<?> entityType : metamodel.getEntities()) {
            final String entityName = entityType.getName();
            final Query query = session.createQuery("from " + entityName);
            System.out.println("executing: " + query.getQueryString());
            for (Object o : query.list()) {
                System.out.println(o.toString());
            }
        }
    }

    public static EmployeeEntity EmployeeOperations(EmployeeEntity emp , Operation operation, HttpServletResponse response) throws IOException {

        Transaction tx = null;
        EmployeeEntity result = emp;

        try (Session session = getSession()) {
            tx = session.beginTransaction();

            switch (operation){
                case SEARCH:
                    System.out.println("Searching employee...");
                    result = session.get(EmployeeEntity.class, emp.getId());
                break;
                case INSERT:
                    System.out.println("Inserting employee...");
//                    emp = null;
//                    emp = new EmployeeEntity();
//                    emp.setAge((short)3);
//                    emp.setEmail("sddsd@dd");
//                    emp.setName("jsee");
                    session.save(emp);
                    break;
                case DELETE:
                    System.out.println("Deleting employee...");
                    session.delete(emp);
                    break;
                case UPDATE:
                    System.out.println("Updating employee...");
                    session.update(emp);
                    break;
                default:
                    System.out.println("No operation found!");
                    break;
            }

            //Show all entities
            reportAllTables(session);
            System.out.println("Process completed");
            //Commit transaction if not failure
            tx.commit();
            response.sendRedirect("ShowEmployees.jsp");

        } catch (HibernateException e) {
            System.out.println("Something went wrong at employee operations!");
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
                System.out.println(e);
            }
            return null;
        }
        return result;
    }


}