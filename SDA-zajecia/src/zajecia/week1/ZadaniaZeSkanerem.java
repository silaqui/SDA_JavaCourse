package zajecia.week1;

import java.util.Scanner;


/**
 * Created by Miki on 04.02.2017.
 */
public class ZadaniaZeSkanerem {

    public static void main(String[] args) {

        calculator();


    }

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void checkNumberFromUser() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (Zajecia4.isEven(number))
        {
            System.out.println("Is even");
        } else
        {
            System.out.println("Is odd");
        }

    }

    public static void listLessThanFromUser() {
        Zajecia4.printLessThan(getInt());
    }

    public static void compareNumbers() {
        compareNumbers(3);
    }

    public static void compareNumbers(int numberOfNumbers) {
        int[] array = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++)
        {
            System.out.print("Enter number " + (i + 1) + " ");
            array[i] = getInt("");
        }
        System.out.println("Max: " + max(array));
        System.out.println("Min: " + min(array));
    }

    public static int max(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (maxNumber < array[i])
            {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static int max(int a, int b, int c) {
        int[] array = {a, b, c};
        return max(array);
    }

    public static int min(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (minNumber > array[i])
            {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public static int min(int a, int b, int c) {
        int[] array = {a, b, c};
        return min(array);
    }

    public static void printEvenLessThanFromUser() {
        Zajecia4.printEvenLessThen(getInt());
    }

    public static int getInt(String message) {
        System.out.print(message + " ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getInt() {
        return getInt("Enter number: ");
    }

    public static double avrOfGrades() {
        int size = getInt("Insert numbers of grades: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = getInt("Insert " + (i + 1) + " grade: ");
        }
        return Zajecia4.avrageOfArray(array);
    }

    public static void calculator() {
        System.out.println("1. Add\n2. Subtract \n3. Multiply \n4. Division");
        int choice = getInt("Chose your action\t");
        if (choice > 0 && choice < 5)
        {
            int a = getInt("First number\t");
            int b = getInt("Second number\t");
            if (choice == 1)
            {
                System.out.println("Result: " + a + "+" + b + "=" + (a + b));
            } else if (choice == 2)
            {
                System.out.println("Result: " + a + "-" + b + "=" + (a - b));
            } else if (choice == 3)
            {
                System.out.println("Result: " + a + "*" + b + "=" + (a * b));
            } else if (choice == 4)
            {
                if (b != 0)
                {
                    System.out.println("Result: " + a + "/" + b + "=" + ((double) a / b));
                }else{
                    System.out.println("Don't Divide by  0");
                }
            }
        } else
        {
            System.out.println("Function choice error");
        }
    }
}
