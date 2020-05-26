package telephone_book;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();

        contacts.put("William A. Lathan", "405-709-1865");
        contacts.put("John K. Miller", "402-247-8568");
        contacts.put("Hortensia E. Foster", "606-481-6467");
        contacts.put("Amanda D. Newland", "319-243-5613");
        contacts.put("Brooke P. Askew", "307-687-2982");

        System.out.println("John K. Miller's phone number: " + contacts.get("John K. Miller"));

        for (Map.Entry<String, String> element : contacts.entrySet()) {
            if (element.getValue().equals("307-687-2982")){
                System.out.println(element.getKey());
            }
        }

        if(contacts.containsKey("Chris E. Myers") == true){
            System.out.println("We know his number");
        } else {
            System.out.println("We don't know his number");
        }
    }
}
