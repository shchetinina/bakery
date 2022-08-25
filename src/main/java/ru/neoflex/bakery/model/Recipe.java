package ru.neoflex.bakery.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "calories")
    private int calories;

    @Column(name = "usefulness")
    private int usefulness;

    @Column(name = "ttm")
    private int ttm;
}
