package map_introduction_two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapIntroductionTwo {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("978-1-60309-452-8", "A Letter to Jo");
        phonebook.put("978-1-60309-459-7", "Lupus");
        phonebook.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        phonebook.put("978-1-60309-461-0", "The Lab");

        for (Map.Entry<String, String> element: phonebook.entrySet()) {
            String k = element.getKey();
            String v = element.getValue();
            System.out.println(v + " (ISBN: " + k + ")");
        }

        phonebook.remove("978-1-60309-444-3");
        phonebook.values().remove("The Lab");
        phonebook.put("978-1-60309-450-4", "They Called Us Enemy");
        phonebook.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(phonebook.containsKey("478-0-61159-424-8"));
        System.out.println(phonebook.get("978-1-60309-453-5"));
    }
}
