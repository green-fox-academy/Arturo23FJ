package green_fox_organization;

public class Sponsor extends Person{
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public String specificIntroduce(){
        return "who represents " + this.company + " and hired " + this.hiredStudents + " students so far.";
    }

    public void hire(){
        this.hiredStudents++;
    }

    @Override
    public String specificGoal(){
        return "Hire brilliant junior software developers.";
    }
}
