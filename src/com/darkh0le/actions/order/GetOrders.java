package com.darkh0le.actions.order;

import com.darkh0le.model.EmployeeEntity;
import com.darkh0le.model.PizzaEntity;
import com.darkh0le.model.PizzaManagement;
import com.opensymphony.xwork2.Action;

import java.util.List;
import java.util.Objects;

/**
 * @author $darkh0le
 */
public class GetOrders implements Action {

    private static List<PizzaEntity> allPizzas = null;

    public GetOrders() {
        allPizzas = PizzaManagement.getAllPizzas();
    }

    @Override
    public String execute() throws Exception {
        System.out.println("In get orders");
        System.out.println(Objects.requireNonNull(PizzaManagement.getAllPizzas()).toString());
        return SUCCESS;
    }
}
