package main.java.music;

public class Violin extends StringedInstrument{
    public Violin(){
        super.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    void sound(){
        System.out.println("Screech");
    }
}
