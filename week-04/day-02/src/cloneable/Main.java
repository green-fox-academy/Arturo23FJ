package cloneable;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("John", 20, "male", "BME");
        Student johnTheClone;
        try {
            johnTheClone = (Student) student.clone();
            johnTheClone.introduce();
        }catch (CloneNotSupportedException e){
            System.out.println("Cloning is not supported");
        }
    }
}
