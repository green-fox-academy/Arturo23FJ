package com.greenfoxacademy.foxclub.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {
    String name;
    List<Trick> tricksList;
    String food;
    String drink;

    public Fox() {
        name = "Karak";
        tricksList = new ArrayList<>();
        food = "bread";
        drink = "lemonade";
    }

    public Fox(String name) {
        this.name = name;
        tricksList = new ArrayList<>();
        food = "bread";
        drink = "lemonade";
    }

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trick> getTricksList() {
        return tricksList;
    }

    public void addTrick(Trick trick) {
        tricksList.add(trick);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
