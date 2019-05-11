package com.darkh0le.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author $darkh0le
 */
@Entity
@Table(name = "Pizza", schema = "PizzaRepo")
public class PizzaEntity {
    private int idPizza;
    private String name;
    private String ingirdients;
    private String sizeOne;
    private String sizeOnePrice;
    private String sizeTwo;
    private String sizeTwoPrice;

    @Id
    @Column(name = "idPizza", nullable = false)
    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
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
    @Column(name = "ingirdients", nullable = true, length = 45)
    public String getIngirdients() {
        return ingirdients;
    }

    public void setIngirdients(String ingirdients) {
        this.ingirdients = ingirdients;
    }

    @Basic
    @Column(name = "sizeOne", nullable = true, length = 45)
    public String getSizeOne() {
        return sizeOne;
    }

    public void setSizeOne(String sizeOne) {
        this.sizeOne = sizeOne;
    }

    @Basic
    @Column(name = "sizeOnePrice", nullable = true, length = 45)
    public String getSizeOnePrice() {
        return sizeOnePrice;
    }

    public void setSizeOnePrice(String sizeOnePrice) {
        this.sizeOnePrice = sizeOnePrice;
    }

    @Basic
    @Column(name = "sizeTwo", nullable = true, length = 45)
    public String getSizeTwo() {
        return sizeTwo;
    }

    public void setSizeTwo(String sizeTwo) {
        this.sizeTwo = sizeTwo;
    }

    @Basic
    @Column(name = "sizeTwoPrice", nullable = true, length = 45)
    public String getSizeTwoPrice() {
        return sizeTwoPrice;
    }

    public void setSizeTwoPrice(String sizeTwoPrice) {
        this.sizeTwoPrice = sizeTwoPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaEntity that = (PizzaEntity) o;
        return idPizza == that.idPizza &&
                Objects.equals(name, that.name) &&
                Objects.equals(ingirdients, that.ingirdients) &&
                Objects.equals(sizeOne, that.sizeOne) &&
                Objects.equals(sizeOnePrice, that.sizeOnePrice) &&
                Objects.equals(sizeTwo, that.sizeTwo) &&
                Objects.equals(sizeTwoPrice, that.sizeTwoPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPizza, name, ingirdients, sizeOne, sizeOnePrice, sizeTwo, sizeTwoPrice);
    }

    @Override
    public String toString() {
        return "PizzaEntity{" +
                "idPizza=" + idPizza +
                ", name='" + name + '\'' +
                ", ingirdients='" + ingirdients + '\'' +
                ", sizeOne='" + sizeOne + '\'' +
                ", sizeOnePrice='" + sizeOnePrice + '\'' +
                ", sizeTwo='" + sizeTwo + '\'' +
                ", sizeTwoPrice='" + sizeTwoPrice + '\'' +
                '}';
    }
}
