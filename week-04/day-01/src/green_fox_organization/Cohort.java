package green_fox_organization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String cohortName;
    List<Student> students;
    List<Mentor> mentors;

    public Cohort(String cohortName) {
        this.cohortName = cohortName;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public void info(){
        System.out.println("The " + cohortName + " cohort has " + students.size() + " students and " + mentors.size()
        + " mentors");
    }
}
