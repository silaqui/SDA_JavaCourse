package zajecia.week1;


import java.util.Scanner;

/**
 * Created by Miki on 06.02.2017.
 */
public class Zadanie {
    public static void main(String[] args) {
        arrayPrinter(userNumberCounter());

    }

    public static int getInt(String messageForUser) {
        System.out.print(messageForUser);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getInt() {
        return getInt("Enter number: ");
    }

    public static int[] userNumberCounter() {
        boolean flag = true;
        int[] array = new int[10];

        while (flag)
        {
            int number = getInt();
            if (number >= 0 && number <= 9)
            {
                array[number]++;
            } else
            {
                flag = false;
            }
        }
        return array;
    }

    public static void arrayPrinter(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0)
            {
                System.out.print("- ");
            } else
            {
                for (int j = 0; j < array[i]; j++)
                {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
