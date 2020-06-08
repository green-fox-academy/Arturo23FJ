package the_garden_application;

public class Plant {
    String color;
    double water;
    boolean needWater;

    public Plant(String color, int water) {
        this.color = color;
        this.water = water;
        this.needWater = getNeedWater();
    }

    public boolean getNeedWater(){
        if (water > 0){
            return true;
        }else {
            return false;
        }
    }

    public double getWater(){
        return water;
    }

    public void setWater(double water){
        this.water = water;
    }
}
