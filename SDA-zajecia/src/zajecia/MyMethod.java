package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Miki on 07.02.2017.
 */
public class MyMethod {
    public static void main(String[] args) {

    }

    public static String getString(String message) {
        System.out.print(message + " ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getString() {
        return getString("In:");
    }

    public static int getInt(String message) {
        System.out.print(message + " ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getInt() {
        return getInt("Enter number: ");
    }

    public static int randomInt(int rangeThisValueIsAlsoGenerated) {
        Random random = new Random();
        return random.nextInt(rangeThisValueIsAlsoGenerated+1);
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


