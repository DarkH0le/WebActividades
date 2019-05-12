package com.darkh0le.actions.order;

import com.darkh0le.model.OrderPojo;
import com.darkh0le.model.PizzaEntity;
import com.darkh0le.model.PizzaManagement;
import com.darkh0le.model.PizzaOrderEntity;
import com.opensymphony.xwork2.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $darkh0le
 */
public class FillOrder implements Action {

    private PizzaEntity pizzaEntity;
    private PizzaOrderEntity pizzaOrderEntity;
    private String selectedPizza;
    private String selectedSize;
    private String sizeOne;
    private String sizeTwo;
    private List<String> sizes;

    @Override
    public String execute() throws Exception {
        System.out.println("InFillOrder");
        System.out.println(selectedPizza);
        System.out.println(sizeOne);
        System.out.println(sizeTwo);
        this.sizes = getSizes();
        return SUCCESS;
    }
    @org.apache.struts2.convention.annotation.Action(value = "fill-order-submit")
    public String submit() throws Exception {
//        System.out.println("in fillorder");
//        System.out.println("order pojo" + order);
        System.out.println("Selected pizza was: " + selectedPizza);
        this.pizzaOrderEntity.setPizzaType(selectedPizza);
        PizzaManagement.setOrder(pizzaOrderEntity);
        return "order-submitted";
    }

    public PizzaOrderEntity getPizzaOrderEntity() {
        return pizzaOrderEntity;
    }
    public void setPizzaOrderEntity(PizzaOrderEntity person) {
        pizzaOrderEntity = person;
    }

//    public String getSelectedSize() {
//        return selectedSize;
//    }
//
//    public void setSelectedSize(String selectedSize) {
//        this.selectedSize = selectedSize;
//    }

    public String getSizeOne() {
        return sizeOne;
    }
    public void setSizeOne(String sizeOne) {
        this.sizeOne = sizeOne;
    }

    public String getSizeTwo() {
        return sizeTwo;
    }

    public void setSizeTwo(String sizeTwo) {
        this.sizeTwo = sizeTwo;
    }

    public void setPizzaEntity(PizzaEntity pizzaEntity) {
        this.pizzaEntity = pizzaEntity;
    }

    public PizzaEntity getPizzaEntity() {
        return pizzaEntity;
    }

    public List<String> getSizes(){
        List<String> list = new ArrayList<>();
        list.add(sizeOne);
        list.add(sizeTwo);
        return list;
    }

    public String getSelectedSize() {
        return selectedSize;
    }

    public void setSelectedSize(String selectedSize) {
        this.selectedSize = selectedSize;
    }

    public String getSelectedPizza() {
        return selectedPizza;
    }

    public void setSelectedPizza(String selectedPizza) {
        this.selectedPizza = selectedPizza;
    }
}
