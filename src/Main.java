import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Marco", 20));
        studenti.add(new Student("Luca", 21));
        studenti.add(new Student("Giovanni", 22));
        studenti.add(new Student("Andrea", 23));

        studenti.sort(Comparator.comparing(Student::getName));
        for(Student studente : studenti) {
            System.out.println(studente.getName() + " " + studente.getAge());
        }
    }

}