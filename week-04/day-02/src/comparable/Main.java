package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);

        for(Domino domino : dominoes){
            System.out.println(domino.toString());
        }

        List<Thing> things = new ArrayList<>();
        things.add(new Thing("Get milk"));
        things.add(new Thing("Remove obstacles"));
        things.add(new Thing("Stand up"));
        things.get(2).complete();
        things.add(new Thing("Eat lunch"));
        things.get(3).complete();
        Collections.sort(things);
        for (Thing thing : things) {
            System.out.println(thing);;
        }

    }
}
