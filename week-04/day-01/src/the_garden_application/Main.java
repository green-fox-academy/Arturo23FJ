package the_garden_application;

public class Main {

    public static void main(String[] args) {
        Garden garden = new Garden();

        garden.addPlants(new Flower("yellow", 0));
        garden.addPlants(new Flower("blue", 0));
        garden.addPlants(new Tree("purple", 0));
        garden.addPlants(new Tree("orange", 0));

        garden.info();
        System.out.println();
        garden.sprinkle(40);
        garden.info();
        System.out.println();
        garden.sprinkle(70);
        garden.info();
    }
}
