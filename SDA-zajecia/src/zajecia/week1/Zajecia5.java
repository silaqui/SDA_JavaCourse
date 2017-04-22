package zajecia.week1;

import java.lang.*;
import java.util.Random;

/**
 * Created by Miki on 06.02.2017.
 */
public class Zajecia5 {
    public static void main(String[] args) {
        int number = 0;
        int choise = 1;
        System.out.println("Photoshop -0.01 beta of alpha");
        while (choise != 0)
        {
            System.out.println();
            System.out.println("1.Triangle\n2.Square\n3.Tree\n4.Ones matrix\n5.Chessboard\n6.Sum of numbers" +
                    "\n7.Array From User\n8.Game\n9.5 random numbers\n0.Exit");
            choise = ZadaniaZeSkanerem.getInt("Pick entry: ");
            System.out.println();
            switch (choise)
            {
                case 0:
                    break;
                case 1:
                    number = ZadaniaZeSkanerem.getInt("Pick your triangle size: ");
                    triangle(number);
                    break;
                case 2:
                    number = ZadaniaZeSkanerem.getInt("Pick your square size: ");
                    square(number);
                    break;
                case 3:
                    number = ZadaniaZeSkanerem.getInt("Pick your tree size: ");
                    tree(number);
                    break;
                case 4:
                    number = ZadaniaZeSkanerem.getInt("Pick your ones matrix size: ");
                    oneMatrix(number);
                    break;
                case 5:
                    number = ZadaniaZeSkanerem.getInt("Pick your chessboard size: ");
                    chessBoard(number);
                    break;
                case 6:
                    sumOfNumbersFromUser();
                    break;
                case 7:
                    displayArray(arrayOfNumbersFromUser());
                    break;
                case 8:
                    System.out.println("You won \nSteps number: " + game(randomInt(100)));
                    break;
                case 9:
                    for (int i = 0; i < 5 ; i++)
                    {
                        System.out.println(randomInt(100));
                    }
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
        System.out.println("Program ended");
    }

    public static void triangle(int number) {
        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void square(int number) {
        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j < number; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void tree(int number) {
        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j < number - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = number - i; k <= number + i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < number; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public static void oneMatrix(int number) {
        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j < number; j++)
            {
                if (i == j)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }

    public static void chessBoard(int number) {
        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j < number; j++)
            {
                System.out.print((i + j + 1) % 2);
            }
            System.out.println();
        }
    }

    public static int sumOfNumbersFromUser() {
        int sum = 0;
        boolean flag = true;
        while (flag)
        {
            int numberFromUser = ZadaniaZeSkanerem.getInt();
            if (numberFromUser != 0)
            {
                sum += numberFromUser;
            } else
            {
                flag = false;
            }
        }
        System.out.println("Sum: " + sum);

        return sum;
    }

    public static int[] arrayOfNumbersFromUser() {
        int[] tmpArray = new int[100];
        boolean flag = true;
        int size = 0;
        while (flag)
        {
            int numberFromUser = ZadaniaZeSkanerem.getInt();
            if (numberFromUser != 0)
            {
                tmpArray[size] = numberFromUser;
                size++;
            } else
            {
                flag = false;
            }
        }
        int[] array = revriteArray(tmpArray, size);
        return array;
    }

    public static int[] revriteArray(int[] bigArray, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = bigArray[i];
        }
        return array;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static int game(int number) {

        boolean flag = true;
        int numberOfSteps = 0;
        while (flag)
        {
            int userNumber = ZadaniaZeSkanerem.getInt();
            numberOfSteps++;
            if (userNumber == number)
            {
                flag = false;
            } else if (userNumber < number)
            {
                System.out.println("Your number is too small");
            } else
            {
                System.out.println("Your number is too big");
            }
        }
        return numberOfSteps;
    }

    public static int randomInt(int range) {
        Random random = new Random();
        return random.nextInt(range+1);
    }

}


