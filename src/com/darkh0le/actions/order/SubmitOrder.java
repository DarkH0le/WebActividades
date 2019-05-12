package com.darkh0le.actions.order;

import com.darkh0le.model.PizzaEntity;
import com.darkh0le.model.PizzaManagement;
import com.darkh0le.model.PizzaOrderEntity;
import com.opensymphony.xwork2.Action;

/**
 * @author $darkh0le
 */
public class SubmitOrder implements Action {
    private PizzaEntity pizzaEntity = new PizzaEntity();
    private PizzaOrderEntity pizzaOrderEntity = new PizzaOrderEntity();
    private  static PizzaManagement pizzaManagement;

    @Override
    public String execute() throws Exception {
//        System.out.println("inSubmitOrder");
////        this.orderEntity.setIdOrder(10);
//        this.orderEntity.setName("asd");
//        this.orderEntity.setStreet("sdf");
//        this.orderEntity.setTown("dsf");
//        this.orderEntity.setCity("df");
//        this.orderEntity.setPhone("sdf");
//        this.orderEntity.setSize("sdf");
//        this.orderEntity.setAmount("sf");
//        this.orderEntity.setIdPizzaFK("1sdf");
        System.out.println("Before submmiting: " + pizzaOrderEntity);
        PizzaManagement.setOrder(pizzaOrderEntity);
        return "submit-order";
    }

    public PizzaEntity getPizzaEntity() {
        return pizzaEntity;
    }

    public void setPizzaEntity(PizzaEntity pizzaEntity) {
        this.pizzaEntity = pizzaEntity;
    }

    public PizzaOrderEntity getOrderEntity() {
        return pizzaOrderEntity;
    }

    public void setOrderEntity(PizzaOrderEntity orderEntity) {
        this.pizzaOrderEntity = orderEntity;
    }
}
