package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animalList;
    int freeSlots;

    public Farm(){
        animalList = new ArrayList<>();
        this.freeSlots = 50;
    }

    public void breed(){
        if (animalList.size() <= freeSlots){
            animalList.add(new Animal());
        }
    }

    public void slaughter(){
        Animal leastHungry = new Animal();
        for(Animal animal : this.animalList){
            if (animal.hunger >= leastHungry.hunger){
                leastHungry = animal;
            }
        }
        for (Animal animal : this.animalList) {
            if (animal.hunger< leastHungry.hunger){
                leastHungry = animal;
            }
        }

        animalList.remove(animalList.indexOf(leastHungry));
    }
}
