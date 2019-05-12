package com.darkh0le.actions.admin.orders;

import com.darkh0le.model.PizzaEntity;
import com.darkh0le.model.PizzaManagement;
import com.darkh0le.model.PizzaOrderEntity;
import com.opensymphony.xwork2.Action;

import java.util.List;
import java.util.Objects;

/**
 * @author $darkh0le
 */
public class Check implements Action {
    private List<PizzaOrderEntity> pizzaOrderEntityList = null;

    public Check() {
        this.pizzaOrderEntityList = PizzaManagement.getAllOrders();
    }

    @Override
    public String execute() throws Exception {
        System.out.println("In get orders action");
        System.out.println(Objects.requireNonNull(pizzaOrderEntityList.toString()));
        return "check";
    }
    public List<PizzaOrderEntity> getPizzaOrderEntityList() {
        return pizzaOrderEntityList;
    }

    public void setPizzaOrderEntityList(List<PizzaOrderEntity> pizzaOrderEntityList) {
        this.pizzaOrderEntityList = pizzaOrderEntityList;
    }
}
