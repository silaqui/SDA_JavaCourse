package utils;


/**
 * Created by Miki on 21.03.2017.
 */
public class GameRunnable implements Runnable {

    private String player;

    public GameRunnable(String name) {
        this.player = name;
    }

    @Override
    public void run() {
        GameUtils gameUtils = new GameUtils();
        gameUtils.playTheGame(player);
    }
}
