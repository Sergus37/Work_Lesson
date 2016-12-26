package by.it;

public class University {
    public Group [] groups;

    //

    public Group getRandomGroup() {
        int randomNumber = (int) (Math.random()*groups.length);
                return  groups [randomNumber];
    }

}
