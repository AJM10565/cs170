import java.util.ArrayList;

public class Student extends Person {
    Professor teacher;
    int Intelligence = 80;
    ArrayList<Integer> grades = new ArrayList<Integer>(0);
    int coursegrade;

    public Student(Professor dude,String name, int Intelligence){

        this.teacher = dude;
        this.name = name;
        this.Intelligence = Intelligence;

    }

}
