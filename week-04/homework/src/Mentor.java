public class Mentor {

    String name;
    int age;
    String gender;
    String level;

    public Mentor(String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public Mentor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";
    }

    public void getGoal(){
        System.out.println("My goal is: Educate brilliant junior software developers");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " " + this.level
        + " mentor");
    }
}
