package com.darkh0le.actions.admin.orders;


import com.darkh0le.model.PizzaManagement;
import com.darkh0le.model.PizzaOrderEntity;
import com.opensymphony.xwork2.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author $darkh0le
 */
public class Delete implements Action {

    private int id;
    @Override

    public String execute() throws Exception {
        PizzaOrderEntity pizzaOrderEntity = new PizzaOrderEntity();
        pizzaOrderEntity.setIdPizzaOrder(this.id);
        PizzaManagement.deleteOrder(pizzaOrderEntity);
        return "check";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
