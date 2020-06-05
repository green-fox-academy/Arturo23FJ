package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpieList;

    public SharpieSet(){
        sharpieList = new ArrayList<>();
    }

    public int countUsable(){
        int count = 0;
        for (Sharpie sharpie : this.sharpieList) {
            if (sharpie.inkAmount > 0){
                count++;
            }
        }
        return count;
    }

    public void removeTrash(){
        for (int i = 0; i < this.sharpieList.size(); i++) {
            if (this.sharpieList.get(i).inkAmount < 0){
                this.sharpieList.remove(i);
                i--;
            }
        }
    }
}
