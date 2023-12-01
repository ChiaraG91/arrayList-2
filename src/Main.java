import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> student = new ArrayList<String>();
        student.add(String.valueOf(new Student("Fabio", 21)));
        student.add(String.valueOf(new Student("Giulia", 20)));
        student.add(String.valueOf(new Student("Mario", 23)));
        student.add(String.valueOf(new Student("Franco", 21)));
        student.add(String.valueOf(new Student("Giorgia", 23)));
        student.add(String.valueOf(new Student("Marco", 25)));
        student.add(String.valueOf(new Student("Luca", 20)));
        student.add(String.valueOf(new Student("Simona", 21)));
        student.add(String.valueOf(new Student("Chiara", 22)));
        student.add(String.valueOf(new Student("Elisabetta", 20)));
        student.add(String.valueOf(new Student("Margherita", 23)));
        student.add(String.valueOf(new Student("Simone", 22)));
        System.out.println(student);

        Collections.sort(student);
        for (String studente : student) {
            System.out.println(studente);
        }


    }
}