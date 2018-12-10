import java.util.ArrayList;

public class Professor extends Person{

    public Professor(String name, int howsmartamI){
        this.name = name;
        Intelligence = howsmartamI;

    }

    public Exam makeExam(int hard){

        Exam exam = new Exam(hard);
        return exam;

    }





}
