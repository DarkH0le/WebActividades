package com.darkh0le.actions.admin.create;

import com.darkh0le.model.PizzaEntity;
import com.darkh0le.model.PizzaManagement;
import com.opensymphony.xwork2.Action;

/**
 * @author $darkh0le
 */
public class Pizza implements Action {

    private String name;
    private String ingredients;
    private String sizeOne;
    private String priceOne;
    private String sizeTwo;
    private String priceTwo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getSizeOne() {
        return sizeOne;
    }

    public void setSizeOne(String sizeOne) {
        this.sizeOne = sizeOne;
    }

    public String getPriceOne() {
        return priceOne;
    }

    public void setPriceOne(String priceOne) {
        this.priceOne = priceOne;
    }

    public String getSizeTwo() {
        return sizeTwo;
    }

    public void setSizeTwo(String sizeTwo) {
        this.sizeTwo = sizeTwo;
    }

    public String getPriceTwo() {
        return priceTwo;
    }

    public void setPriceTwo(String priceTwo) {
        this.priceTwo = priceTwo;
    }

    @Override
    public String execute() throws Exception {
        return "pizza";
    }

    @org.apache.struts2.convention.annotation.Action(value="pizza-submit")
    public String submit() throws Exception {
        System.out.println("Inseting new pizza");
        PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setName(getName());
        pizzaEntity.setIngirdients(getIngredients());
        pizzaEntity.setSizeOne(getSizeOne());
        pizzaEntity.setSizeOnePrice(getPriceOne());
        pizzaEntity.setSizeTwo(getSizeTwo());
        pizzaEntity.setSizeTwoPrice(getPriceTwo());
        PizzaManagement.altaPizza(pizzaEntity);
        return "pizza-submitted";
    }
}
