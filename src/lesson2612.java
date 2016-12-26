import by.it.ArrayWorker;
import by.it.Group;
import by.it.Student;
import by.it.University;

public class lesson2612 {

    public static void main(String[] args) {
        University university = new University();
        university.groups = new Group[3];

        for (int i = 0; i < university.groups.length; i++) {
            university.groups[i] = new Group();
            university.groups[i].students = new Student[3];
            for (int j = 0; j > university.groups[i].students.length; j++) {
                university.groups[i].students[j] = new Student();
            }
        }
                  university.groups[0].students[0].readBook();
                  university.groups[0].students[0].readBook();
                  university.groups[0].students[0].beer();
        System.out.println(university.groups[0].students[0].level);


        //
        for (int i = 0; i <30; i++)
            university.getRandomGroup().getRandomStudent().readBook();

        for (int i = 0; i <20; i++)
            university.getRandomGroup().getRandomStudent().beer();

        for (int i = 0; i < university.groups.length; i++){
            university.groups[i].level = 0;
            for (int j = 0; j < university.groups[i].students.length; j++){
                university.groups[i].level += university.groups[i].students[j].level;
                System.out.println("Student " + j + " level" + university.groups[i].students[j].level);
            }
            System.out.println("Student " + i + " level" + university.groups[i].level);
        }

    }

    public static void programm1(String[] args) {
        ArrayWorker cheburashka = new ArrayWorker();
        int[] a = cheburashka.createArray(10);
        cheburashka.printArray(a);
        int m = cheburashka.getMax(a);
        System.out.println("max: " + m);
        System.out.println(cheburashka.count);

        ArrayWorker gena = new ArrayWorker();
        int[] b = gena.createArray(20);
        int[] c = gena.createArray(10);
        gena.printArray(a);
        gena.printArray(a);
        System.out.println(gena.getMax(c));
        System.out.println(gena.count);

    }


}
