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
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "calories")
    private Integer calories;

    @Column(name = "usefulness")
    private Integer usefulness;

    @Column(name = "ttm")
    private Integer ttm;

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                ", usefulness=" + usefulness +
                ", ttm=" + ttm +
                '}';
    }
}
