package zajecia.week1;

import java.util.Scanner;

/**
 * Created by Miki on 05.02.2017.
 */
public class BMI {
    public static void main(String[] args) {
        int weight = getInt("Podaj masę w kg ");
        int hight = getInt("Podaj wzrost w cm " );
        System.out.println("Twój indeks BMI to: " + BMI (weight,hight));

    }

    public static int getInt(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    public static double BMI (double weight, double height){
        return weight/(height*height/10000);
    }

}
