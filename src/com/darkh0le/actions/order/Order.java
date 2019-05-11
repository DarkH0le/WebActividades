package com.darkh0le.actions.order;

import com.darkh0le.model.PizzaEntity;
import com.darkh0le.model.PizzaManagement;
import com.opensymphony.xwork2.Action;

import java.util.List;
import java.util.Objects;

/**
 * @author $darkh0le
 */
public class Order implements Action {

    private List<PizzaEntity> allPizzas = null;
    private String test = "Test1";
    private String test2 = "Tes2t";

    public Order() {
        this.allPizzas = PizzaManagement.getAllPizzas();
    }

    public String getTest() {
        return this.test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("In get orders");
        System.out.println(Objects.requireNonNull(PizzaManagement.getAllPizzas()).toString());
        return SUCCESS;
    }

    public List<PizzaEntity> getAllPizzas() {
        return this.allPizzas;
    }

    public void setAllPizzas(List<PizzaEntity> allPizzas) {
        this.allPizzas = allPizzas;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }


    @Override
    public String toString() {
        return "GetOrders{" +
                "test2='" + test2 + '\'' +
                '}';
    }
}
