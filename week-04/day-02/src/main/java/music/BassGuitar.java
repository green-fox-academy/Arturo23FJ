package main.java.music;

public class BassGuitar extends StringedInstrument{
    public BassGuitar(){
        super.numberOfStrings = 4;
    }

    public BassGuitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    void sound(){
        System.out.println("Duum-duum-duum");
    }
}
