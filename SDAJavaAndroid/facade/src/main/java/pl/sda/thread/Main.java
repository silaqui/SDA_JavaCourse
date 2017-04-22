package pl.sda.thread;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

/**
 * Created by Miki on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        SDAThread sdaThread1 = new SDAThread(1);
        SDAThread sdaThread2 = new SDAThread(2);
        SDAThread sdaThread3 = new SDAThread(3);
        SDAThread sdaThread4 = new SDAThread(4);

        Thread thread1 = new Thread(sdaThread1);
        Thread thread2 = new Thread(sdaThread2);
        Thread thread3 = new Thread(sdaThread3);
        Thread thread4 = new Thread(sdaThread4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println("Koniec Main");

    }
}
