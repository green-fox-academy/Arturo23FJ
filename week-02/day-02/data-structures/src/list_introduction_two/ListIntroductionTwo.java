package list_introduction_two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListIntroductionTwo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Avocado");
        fruits.add("Blueberries");
        fruits.add("Durian");
        fruits.add("Lychee");

        List<String> freshFruits = new ArrayList<>();
        freshFruits.addAll(fruits);
        System.out.println(fruits.contains("Durian"));
        freshFruits.remove("Durian");
        fruits.add(4, "Kiwifruit");
        System.out.println(fruits.equals(freshFruits));
        System.out.println(fruits.indexOf("Avocado"));
        System.out.println(freshFruits.indexOf("Durian"));
        Collections.addAll(freshFruits, "Passion Fruit", "Pomelo");
        System.out.println(fruits.get(2));
    }
}
