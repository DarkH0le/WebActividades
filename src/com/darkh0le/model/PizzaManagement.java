package com.darkh0le.model;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.metamodel.EntityType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * @author $darkh0le
 */
public class PizzaManagement {
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

    //TODO: Change signature to pizza objects
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


//    public static EmployeeOperations(EmployeeEntity emp , Operation operation, HttpServletResponse response) throws IOException {
//
//        Transaction tx = null;
//        EmployeeEntity result = emp;
//
//        try (Session session = getSession()) {
//            tx = session.beginTransaction();
//
//            switch (operation){
//                case SEARCH:
//                    System.out.println("Searching employee...");
//                    result = session.get(EmployeeEntity.class, emp.getId());
//                break;
//                case INSERT:
//                    System.out.println("Inserting employee...");
////                    emp = null;
////                    emp = new EmployeeEntity();
////                    emp.setAge((short)3);
////                    emp.setEmail("sddsd@dd");
////                    emp.setName("jsee");
//                    session.save(emp);
//                    break;
//                case DELETE:
//                    System.out.println("Deleting employee...");
//                    session.delete(emp);
//                    break;
//                case UPDATE:
//                    System.out.println("Updating employee...");
//                    session.update(emp);
//                    break;
//                default:
//                    System.out.println("No operation found!");
//                    break;
//            }
//
//            //Show all entities
//            reportAllTables(session);
//            System.out.println("Process completed");
//            //Commit transaction if not failure
//            tx.commit();
//            response.sendRedirect("ShowEmployees.jsp");
//
//        } catch (HibernateException e) {
//            System.out.println("Something went wrong at employee operations!");
//            if (tx != null) {
//                tx.rollback();
//                e.printStackTrace();
//                System.out.println(e);
//            }
//            return null;
//        }
//        return result;
//    }

    public static boolean altaPizza(PizzaEntity pizza){

        System.out.println("Inseting Pizza");
        Transaction tx = null;
//        EmployeeEntity result = emp;

        try (Session session = getSession()) {
            tx = session.beginTransaction();
            session.save(pizza);

            //Show all entities
//            reportAllTables(session);
            System.out.println("Process completed");
            //Commit transaction if not failure
            tx.commit();
            //response.sendRedirect("ShowEmployees.jsp");

        } catch (HibernateException e) {
            System.out.println("Something went wrong while inserting a new pizza");
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
                System.out.println(e);
            }
            return false;
        }
        return true;
    }

    public static boolean setOrder(OrderEntity orderEntity){

        System.out.println("Inseting new OrderBean");
        Transaction tx = null;
//        EmployeeEntity result = emp;

        try (Session session = getSession()) {
            tx = session.beginTransaction();
            session.save(orderEntity);

            //Show all entities
//            reportAllTables(session);
            System.out.println("Process completed");
            //Commit transaction if not failure
            tx.commit();
            //response.sendRedirect("ShowEmployees.jsp");

        } catch (HibernateException e) {
            System.out.println("Something went wrong while inserting a new order");
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
                System.out.println(e);
            }
            return false;
        }
        return true;
    }



    public static List<PizzaEntity> getAllPizzas() {

        System.out.println("Getting all the Pizzas");
        Transaction tx = null;
//        EmployeeEntity result = emp;

        try (Session session = getSession()) {
            tx = session.beginTransaction();
//            session.save(pizza);
//            session.createCriteria(MyEntity.class).list();
            CriteriaQuery<PizzaEntity> criteriaQuery = session.getCriteriaBuilder().createQuery(PizzaEntity.class);
            criteriaQuery.from(PizzaEntity.class);

            List<PizzaEntity> allPizzas = session.createQuery(criteriaQuery).getResultList();
            //Show all entities
//            reportAllTables(session);
            System.out.println("Process completed");
            //Commit transaction if not failure
            tx.commit();
            //response.sendRedirect("ShowEmployees.jsp");
            return allPizzas;
        } catch (HibernateException e) {
            System.out.println("Something went wrong while getting all the pizzas");
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
                System.out.println(e);
            }
        }
        return null;
//        return session.createCriteria(MyEntity.class).list();

    }
}