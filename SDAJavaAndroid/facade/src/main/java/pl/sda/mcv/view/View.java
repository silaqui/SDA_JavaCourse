package pl.sda.mcv.view;


import pl.sda.mcv.controller.Controller;

import java.util.Scanner;

/**
 * Created by Miki on 25.02.2017.
 */
public class View {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            Long choice = scanner.nextLong();

            if (choice != null && choice >0 )
            {
                Long result = Controller.getFibValue(choice);
                System.out.println("Fib " + result);
            }else
            {
                System.out.println("Avr: "+ Controller.average());
            }
        }
    }

}
