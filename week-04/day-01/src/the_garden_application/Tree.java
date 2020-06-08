package the_garden_application;

public class Tree extends Plant{
    public Tree(String color, int water) {
        super(color, water);
        this.needWater = getNeedWater();
    }

    @Override
    public boolean getNeedWater(){
        if (water < 10){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void setWater(double water){
        double temp = this.getWater();
        this.water = (temp + (water * 0.4));
    }
}
