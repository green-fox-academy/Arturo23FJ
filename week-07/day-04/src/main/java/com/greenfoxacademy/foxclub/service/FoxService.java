package com.greenfoxacademy.foxclub.service;


import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxService {
    Fox fox;
    List<Fox> foxes;
    List<Trick> tricks;

    @Autowired
    public FoxService() {
        this.fox = new Fox();
        this.foxes = new ArrayList<>();
        this.tricks = Arrays.asList(
                new Trick("do the peek-a-boo style"),
                new Trick("do the Davids heel flick"),
                new Trick("play the piano"),
                new Trick("make Juventus UCL winner"),
                new Trick("teach me, how to Spring Boot"));
    }

    public Fox getFox() {
        return fox;
    }

    public List<Trick> getTricks() {
        return tricks;
    }

    public void setFoodAndDrink(String food, String drink){
        this.fox.setFood(food);
        this.fox.setDrink(drink);
    }

    public void loadActualFox(String name){
        for(Fox foxResult : foxes){
            if (foxResult.getName().equals(name)){
                this.fox = foxResult;
            }
        }
    }

    public void createAndAddFoxToList(String name){
        foxes.add(new Fox(name));
        loadActualFox(name);
    }

    public boolean doesListContainFoxname(String name){
        loadActualFox(name);
        return foxes.stream().anyMatch(f -> f.getName().equals(name));
    }
}
