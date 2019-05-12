package com.darkh0le.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author $darkh0le
 */
@Entity
@Table(name = "PizzaOrder", schema = "PizzaRepo", catalog = "")
public class PizzaOrderEntity {
    private int idPizzaOrder;
    private String name;
    private String street;
    private String town;
    private String city;
    private String phone;
    private String size;
    private String amout;
    private String pizzaType;

    @Id
    @Column(name = "idPizzaOrder", nullable = false)
    public int getIdPizzaOrder() {
        return idPizzaOrder;
    }

    public void setIdPizzaOrder(int idPizzaOrder) {
        this.idPizzaOrder = idPizzaOrder;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "street", nullable = true, length = 45)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "town", nullable = true, length = 45)
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 45)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "size", nullable = true, length = 45)
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "amout", nullable = true, length = 45)
    public String getAmout() {
        return amout;
    }

    public void setAmout(String amout) {
        this.amout = amout;
    }

    @Basic
    @Column(name = "pizzaType", nullable = true, length = 45)
    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaOrderEntity that = (PizzaOrderEntity) o;
        return idPizzaOrder == that.idPizzaOrder &&
                Objects.equals(name, that.name) &&
                Objects.equals(street, that.street) &&
                Objects.equals(town, that.town) &&
                Objects.equals(city, that.city) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(size, that.size) &&
                Objects.equals(amout, that.amout) &&
                Objects.equals(pizzaType, that.pizzaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPizzaOrder, name, street, town, city, phone, size, amout, pizzaType);
    }

    @Override
    public String toString() {
        return "PizzaOrderEntity{" +
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
