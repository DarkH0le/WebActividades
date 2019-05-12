package com.darkh0le.actions.order;

import com.darkh0le.model.OrderEntity;
import com.darkh0le.model.PizzaEntity;
import com.darkh0le.model.PizzaManagement;
import com.opensymphony.xwork2.Action;

/**
 * @author $darkh0le
 */
public class Submit implements Action {
    private PizzaEntity pizzaEntity = new PizzaEntity();
    private OrderEntity orderEntity = new OrderEntity();
    private  static PizzaManagement pizzaManagement;

    @Override
    public String execute() throws Exception {
        System.out.println(orderEntity);
        this.orderEntity.setIdPizza("1");
        PizzaManagement.setOrder(orderEntity);
        return SUCCESS;
    }

    public PizzaEntity getPizzaEntity() {
        return pizzaEntity;
    }

    public void setPizzaEntity(PizzaEntity pizzaEntity) {
        this.pizzaEntity = pizzaEntity;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }
}
