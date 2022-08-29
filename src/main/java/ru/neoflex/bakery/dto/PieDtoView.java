package ru.neoflex.bakery.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PieDtoView {

    private String naming;

    private double cost;

    private int numberOfCalories;

    private int benefit;

    //time for preparing
    private int tfp;

    @Override
    public String toString() {
        return "PieDtoView{" +
                "naming='" + naming + '\'' +
                ", cost=" + cost +
                ", numberOfCalories=" + numberOfCalories +
                ", benefit=" + benefit +
                ", tfp=" + tfp +
                '}';
    }
}
