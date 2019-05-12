package com.darkh0le.actions.admin.orders;

import com.darkh0le.model.PizzaManagement;
import com.darkh0le.model.PizzaOrderEntity;
import com.opensymphony.xwork2.Action;

/**
 * @author $darkh0le
 */
public class Edit implements Action {

    private PizzaOrderEntity pizzaOrderEntity = null;

    private int id;


    @Override
    public String execute() throws Exception {
        pizzaOrderEntity = PizzaManagement.getOrder(id);
        System.out.println(id);
        return SUCCESS;
    }

    @org.apache.struts2.convention.annotation.Action(value="edit-submit")
    public String submit() throws Exception{
        System.out.println("Subbminith the changess");

        System.out.println("IDENTIFICADOR: " + pizzaOrderEntity.getIdPizzaOrder());
//        pizzaOrderEntity.setIdPizzaOrder(getId());
        System.out.println("ORDEN A ACTUALIZAR: " + pizzaOrderEntity);
        PizzaManagement.updateOrder(pizzaOrderEntity);
        return SUCCESS;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PizzaOrderEntity getPizzaOrderEntity() {
        return pizzaOrderEntity;
    }

    public void setPizzaOrderEntity(PizzaOrderEntity pizzaOrderEntity) {
        this.pizzaOrderEntity = pizzaOrderEntity;
    }
}
