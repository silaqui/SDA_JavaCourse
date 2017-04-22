package utils;

import model.User;

import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * Created by Miki on 21.03.2017.
 */
public class GameUtils {

    public int rollTheDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public int giveScores(int rollOne, int rollTwo) {
        int result = 0;
        if (rollOne + rollTwo == 7) {
            result++;
        }
        return result;
    }

    public void thinkAWhile ()    {
        Random random = new Random();
        try {
            sleep(random.nextInt(11)*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int rollWithShout(User player) {
        int roll = rollTheDice();
        System.out.println("\t\t\tGracz " + player.getName() + " \t rzucił: " + roll);
        return roll;
    }

    public User playRound(User player) {

        int rollOne = rollWithShout(player);
        thinkAWhile();

        int rollTwo = rollWithShout(player);
        thinkAWhile();

        System.out.println("\t"+player.getName() + " suma rundy: " + (rollOne + rollTwo));

        player.addPoint(giveScores(rollOne, rollTwo));

        System.out.println("\t" + player.getName() + " wynik po rundzie " + player.getScore());
        thinkAWhile();

        return player;
    }

    public void playTheGame(String userName) {
        User user = new User(userName);
        GameUtils game = new GameUtils();

        for (int i = 0; i < 20; i++) {
            user = game.playRound(user);
        }
        System.out.println("Wynik końcowy dla " + user.getName() + ": "+ user.getScore());
    }
}
