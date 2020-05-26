package map_introduction_one;

import java.util.HashMap;
import java.util.Map;

public class MapIntroductionOne {
    public static void main(String[] args) {
        Map<Integer, Character> myMap = new HashMap<>();
        System.out.println(myMap.isEmpty());

        myMap.put(97, 'a');
        myMap.put(98, 'b');
        myMap.put(99, 'c');
        myMap.put(65, 'A');
        myMap.put(66, 'B');
        myMap.put(67, 'C');

        for (Map.Entry<Integer, Character> element : myMap.entrySet()) {
            int k = element.getKey();
            char v = element.getValue();
            System.out.println(k);
            System.out.println(v);
        }

        myMap.put(68, 'D');
        System.out.println(myMap.size());
        System.out.println(myMap.get(99));
        myMap.remove(97);
        System.out.println(myMap.containsKey(100));
        myMap.clear();
    }
}
