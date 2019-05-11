package com.darkh0le.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author $darkh0le
 */
@Entity
@Table(name = "Order", schema = "PizzaRepo", catalog = "")
public class OrderEntity {
    private int idOrder;
    private String street;
    private String neighborhood;
    private String city;
    private String phone;
    private String size;
    private String amount;
    private String idPizza;

    @Id
    @Column(name = "idOrder", nullable = false)
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
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
    @Column(name = "neighborhood", nullable = true, length = 45)
    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
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
    @Column(name = "amount", nullable = true, length = 45)
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "idPizza", nullable = true, length = 45)
    public String getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(String idPizza) {
        this.idPizza = idPizza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return idOrder == that.idOrder &&
                Objects.equals(street, that.street) &&
                Objects.equals(neighborhood, that.neighborhood) &&
                Objects.equals(city, that.city) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(size, that.size) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(idPizza, that.idPizza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrder, street, neighborhood, city, phone, size, amount, idPizza);
    }
}
