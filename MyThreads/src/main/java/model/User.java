package model;

/**
 * Created by Miki on 21.03.2017.
 */
public class User {

    private String name;
    private int score;



    public User(String name) {
        this.name = name;
        this.score = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addPoint (int point)
    {
        this.score+=point;
    }
}
