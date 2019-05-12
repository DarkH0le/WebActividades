package com.darkh0le.model;

/**
 * @author $darkh0le
 */
public class OrderPojo {

    private int idPizzaOrder;
    private String name;
    private String street;
    private String town;
    private String city;
    private String phone;
    private String size;
    private String amout;
    private String pizzaType;


    public int getIdPizzaOrder() {
        return idPizzaOrder;
    }

    public void setIdPizzaOrder(int idPizzaOrder) {
        this.idPizzaOrder = idPizzaOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAmout() {
        return amout;
    }

    public void setAmout(String amout) {
        this.amout = amout;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    @Override
    public String toString() {
        return "OrderPojo{" +
                "idPizzaOrder=" + idPizzaOrder +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", size='" + size + '\'' +
                ", amout='" + amout + '\'' +
                ", pizzaType='" + pizzaType + '\'' +
                '}';
    }
}
