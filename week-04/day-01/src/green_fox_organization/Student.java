package green_fox_organization;

public class Student extends Person{
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    public Student(){
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    public String specificGoal(){
        return "Be a junior software developer";
    }


    @Override
    public String specificIntroduce(){
        return " from "  + this.previousOrganization + " who skipped " + this.skippedDays + " days already";
    }


    public void skipDays(int numberOfDays){

        this.skippedDays += numberOfDays;
    }
}
