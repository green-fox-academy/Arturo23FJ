package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Pirate> crew;
    Pirate captain;
    Random randomNumberOfPirates;

    public void fillShip(){
        this.crew = new ArrayList<>();
        this.randomNumberOfPirates = new Random();
        int size = (25 + this.randomNumberOfPirates.nextInt(25));
        for (int i = 0; i < size; i++) {
            this.crew.add(new Pirate());
        }
        this.captain = new Pirate();
    }

    public void represent(){
        String text = "";
        if (!this.captain.alive){
            text = "he is gone";
        } else if (this.captain.passedOut){
            text = "he is passed out";
        } else {
            text = "he is ready to battle";
        }
        System.out.println("The captain consumed " + this.captain.levelOfRum + ", " + text);
        System.out.println("The crew is made up of " + this.crew.size() + " pirates");
    }

    public int countPirates(){
        int count = 0;
        for (int i = 0; i < this.crew.size(); i++) {
            if (this.crew.get(i).alive){
                count++;
            }
        }
        return count;
    }

    public int calculateScore(){
        int score = this.countPirates() - this.captain.levelOfRum;
        return score;
    }

    public boolean battle(Ship othership){
        if (this.calculateScore() > othership.calculateScore()){
            
        }
    }
}
