package ru.neoflex.bakery.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "pies")
public class Pie {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}
