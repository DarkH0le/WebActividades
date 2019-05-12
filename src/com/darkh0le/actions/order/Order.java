package com.darkh0le.actions.order;

import com.darkh0le.model.PizzaEntity;
import com.darkh0le.model.PizzaManagement;
import com.darkh0le.model.PizzaOrderEntity;
import com.opensymphony.xwork2.Action;

import java.util.List;
import java.util.Objects;

/**
 * @author $darkh0le
 */
public class Order implements Action {

    private List<PizzaEntity> allPizzas = null;

    public Order() {
        this.allPizzas = PizzaManagement.getAllPizzas();
    }

    @Override
    public String execute() throws Exception {
        System.out.println("In get orders action");
        System.out.println(Objects.requireNonNull(PizzaManagement.getAllPizzas()).toString());
        return SUCCESS;
    }

    public List<PizzaEntity> getAllPizzas() {
        return this.allPizzas;
    }

    public void setAllPizzas(List<PizzaEntity> allPizzas) {
        this.allPizzas = allPizzas;
    }

}
