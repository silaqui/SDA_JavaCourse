package main;

import model.MainScore;
import model.User;
import utils.GameRunnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        MainScore mainScore = new MainScore();


        int threadNumber = 3;
        ExecutorService executor = Executors.newFixedThreadPool(threadNumber);

        GameRunnable gameRunnable1 = new GameRunnable("Kasia");
        GameRunnable gameRunnable2 = new GameRunnable("Basia");
        GameRunnable gameRunnable3 = new GameRunnable("Asia");

//        Runnable thread3 = () -> {
//            message("2 Rzut kostka ...");
//            Random random = new Random();
//            int number = random.nextInt(6) + 1;
//            message("Wypadlo oczek " + number);
//
//        };

        executor.execute(gameRunnable1);
        executor.execute(gameRunnable2);
        executor.execute(gameRunnable3);
        executor.shutdown();

    }
}
