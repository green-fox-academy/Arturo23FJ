package green_fox_organization;

public class Mentor extends Person{
    String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor(){
        super();
        this.level = "intermediate";
    }

    @Override
    public String specificGoal(){
        return "Educate brilliant junior software developers";
    }

    @Override
    public String specificIntroduce(){
        return this.level + " mentor";
    }
}
