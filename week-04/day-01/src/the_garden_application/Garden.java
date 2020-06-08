package the_garden_application;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants;

    public Garden(){
        this.plants = new ArrayList<>();
    }

    public void addPlants(Plant newPlant){
        this.plants.add(newPlant);
    }

    public double getTheAmountOfPlantsNeedWater(List<Plant> plants, double waterAmount){
        int count = 0;
        for(Plant plant : plants){
            if (plant.getNeedWater()){
                count++;
            }
        }
        return waterAmount / count;
    }

    public void info(){
        for (Plant plant : this.plants) {
            if (plant instanceof Tree){
                System.out.println("The " + plant.color + " tree " + (((Tree)plant).getNeedWater() ? "needs " :
                        "doesn't need ") + "water");
            }else{
                System.out.println("The " + plant.color + " flower "  + (((Flower)plant).getNeedWater() ? "needs " :
                        "doesn't need ") + "water");
            }
        }
    }

    public void sprinkle(int waterAmount){
        System.out.println("Watering with " + waterAmount);
        double waterAMountForOnePlant = getTheAmountOfPlantsNeedWater(this.plants, waterAmount);
        for (Plant plant : this.plants){
            if (plant.getNeedWater()){
                if (plant instanceof Tree){
                    ((Tree)plant).setWater(waterAMountForOnePlant);
                } else {
                    ((Flower)plant).setWater(waterAMountForOnePlant);
                }
            }
        }
    }
}
