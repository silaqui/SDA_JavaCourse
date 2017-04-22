package zajecia.week2;

import zajecia.MyMethod;

/**
 * Created by Miki on 07.02.2017.
 */
public class Zajecia6 {
    public static void main(String[] args) {


    }

    public static int sumUntil(int sumLimit) {
        int sum = 0;
        int counter = 0;
        boolean flag = true;
        while (flag)
        {
            sum += MyMethod.getInt("Enter number to add: ");
            counter++;
            if (sum > sumLimit)
            {
                flag = false;
            }
        }
        return counter;
    }

    public static int sumUntilAverage(int AvregeLimit) {
        int sum = 0;
        int counter = 0;
        boolean flag = true;
        while (flag)
        {
            sum += MyMethod.getInt("Enter number to add: ");
            counter++;
            if ((double) sum / counter > AvregeLimit)
            {
                flag = false;
            }
        }
        return counter;
    }

    public static void calculator() {
        boolean flag = true;
        int a = 0;
        int b = 0;

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");

        while (flag)
        {
            System.out.println("--------------------------------");
            int choise = MyMethod.getInt("Choose your action: ");
            if (choise > 0 && choise < 5)
            {
                a = MyMethod.getInt("First number: \t");
                b = MyMethod.getInt("Second number: \t");
            }
            switch (choise)
            {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("Result: \t\t" + (a + b));
                    break;
                case 2:
                    System.out.println("Result: \t" + (a - b));
                    break;
                case 3:
                    System.out.println("Result: \t" + (a * b));
                    break;
                case 4:
                    if (b == 0)
                    {
                        System.out.println("Don't diveide by 0 !");
                        break;
                    }
                    System.out.println("Result: \t" + ((double) a / b));
                    break;
                default:
                    System.out.println("Wrong pick. ");
                    break;
            }
        }
    }

    public static String cezarCode(String message, int seed) {
        char[] charArray = message.toCharArray();
        char[] codedArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++)
        {
            codedArray[i] = charArray[i] += seed;
        }
        return String.valueOf(charArray);
    }

    public static String cezarCode(String message) {
        return cezarCode(message, 1);
    }

    public static String decodeCezarCode(String message) {
        return cezarCode(message, -1);
    }

    public static String decodeCezarCode(String message, int seed) {
        return cezarCode(message, -seed);
    }


}
