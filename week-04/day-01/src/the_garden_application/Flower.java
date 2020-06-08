package the_garden_application;

public class Flower extends Plant{
    public Flower(String color, int water) {
        super(color, water);
        this.needWater = getNeedWater();
    }

    @Override
    public boolean getNeedWater(){
        if (super.water < 5){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setWater(double water){
        double temp = this.getWater();
        this.water = (temp + (water * 0.75));
    }
}
