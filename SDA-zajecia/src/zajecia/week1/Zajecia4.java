package zajecia.week1;


/**
 * Created by Miki on 04.02.2017.
 */
public class Zajecia4 {

    public static void main(String[] args) {

//        System.out.print("Podaj liczbe: ");
//        int number = getInt();
//        System.out.println("Na far: " + convertToFahrenheit(number));
//        System.out.println("Na cel: " + convertToCelsius(number));

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        statisticDisplay(makeArray());

//        System.out.print("Enter number ");
//        int number = ZadaniaZeSkanerem.getInt();
//        if(isEven(number)){
//            System.out.println(number + " is Even");
//        }else{
//            System.out.println(number + " is Odd");
//        }

    }

    public static int[] makeArray() {
        int length = ZadaniaZeSkanerem.getInt("Enter array size:");
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = ZadaniaZeSkanerem.getInt("Enter " + (i + 1) + " element: ");
        }
        System.out.println();
        return array;
    }

    public static void printLessThan(int number) {
        System.out.println();
        if (number >= 0)
        {
            for (int i = 0; i <= number; i++)
            {
                System.out.print(i + " ");
            }
        } else
        {
            System.out.println("Wrong data");
        }
    }

    public static void printOddLessThen(int number) {
        System.out.println();
        if (number >= 0)
        {
            for (int i = 1; i <= number; i += 2)
            {
                System.out.print(i + " ");
            }
        } else
        {
            System.out.print("Wrong data");
        }

    }

    public static void printEvenLessThen(int number) {
        System.out.println();
        if (number >= 0)
        {
            for (int i = 0; i <= number; i += 2)
            {
                System.out.print(i + " ");
            }
        } else
        {
            System.out.print("Wrong data");
        }

    }

    public static int sumOfLessThan(int number) {
        int counter = 0;
        if (number >= 0)
        {
            for (int i = 0; i <= number; i++)
            {
                counter += i;
            }
        } else
        {
            System.out.println("Wrong data");
        }
        return counter;
    }

    public static int productOfLessThan(int number) {
        int counter = 1;
        for (int i = 1; i <= number; i++)
        {
            counter *= i;
        }
        return counter;
    }

    public static double convertToFahrenheit(double celsius) {
        return (celsius - 32) / 1.8;
    }

    public static double convertToCelsius(double fahrenheit) {
        return fahrenheit * 1.8 - 32;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0)
        {
            return true;
        }
        return false;
    }

    public static boolean isOdd(int number) {
        return !isEven(number);
    }

    public static int sumOfArray(int[] array) {
        int coutner = 0;
        for (int i = 0; i < array.length; i++)
        {
            coutner += array[i];
        }
        return coutner;
    }

    public static double productOfArray(int[] array) {
        int coutner = 1;
        for (int i = 0; i < array.length; i++)
        {
            coutner *= array[i];
        }
        return coutner;
    }

    public static double avrageOfArray(int[] array) {
        double counter = 0;
        for (int i = 0; i < array.length; i++)
        {
            counter += array[i];
        }
        return counter / array.length;
    }

    public static int sumOfEven(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (isEven(array[i]))
            {
                counter += array[i];
            }
        }
        return counter;
    }

    public static int sumOfOdd(int[] array) {
        return sumOfArray(array) - sumOfEven(array);
    }

    public static int numberOfEven(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (isEven(array[i]))
            {
                counter++;
            }
        }
        return counter;
    }

    public static int numberOfOdd(int[] array) {
        return array.length - numberOfEven(array);
    }

    public static void statisticDisplay(int[] array) {

        System.out.print("Odd numbers: \t");
        for (int i = 0; i < array.length; i++)
        {
            if (isOdd(array[i]))
            {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\nSum of odd: \t" + sumOfOdd(array));
        System.out.println("Number of odd: \t" + numberOfOdd(array) + "\n");


        System.out.print("Even numbers: \t");
        for (int i = 0; i < array.length; i++)
        {
            if (isEven(array[i]))
            {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\nSum of even: \t" + sumOfEven(array));
        System.out.println("Number of even:\t" + numberOfEven(array));

        System.out.println();
        System.out.println("Avrage: \t" + avrageOfArray(array));
        System.out.println("Sum: \t \t" + sumOfArray(array));
        System.out.println("Product: \t" + productOfArray(array));
    }


}


























