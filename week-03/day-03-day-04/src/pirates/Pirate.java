package pirates;

import java.util.Random;

public class Pirate {
    int levelOfRum;
    boolean alive = true;
    boolean passedOut;

    public void drinkSomeRum(){
        if(this.alive){
            this.levelOfRum++;
        }else{
            System.out.println("No more shots for the dead man");
        }
    }

    public void howItGoingMate(){
        if (this.alive) {

            if (levelOfRum <= 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            }
        }else{
            System.out.println("No more shots for the dead man");
        }
    }

    public void passOut(){
        this.levelOfRum = 0;
        this.passedOut = true;
    }

    public void die(){
        this.alive = false;
    }

    public void brawl(Pirate anotherPirate){
        if ((this.alive) && (anotherPirate.alive)){
            Random rand = new Random();
            int r = rand.nextInt(101);
            if (r <= 33){
                this.die();
            } else if ((r > 33) && (r <= 66)) {
                anotherPirate.die();
            } else {
                this.passOut();
                anotherPirate.passOut();
            }
        }
    }
}
