package by.it;

public class Group {
    public Student [] students; // массив студентов этой группы
    public int number;
    public int level;

    public Student getRandomStudent (){
        int randomNumber = (int) (Math.random()*students.length);
        return  students [randomNumber];
    }


}
