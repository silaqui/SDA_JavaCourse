package zajecia.week2;

import zajecia.MyMethod;

/**
 * Created by Miki on 09.02.2017.
 */
public class Zajecia8 {
    public static void main(String[] args) {

//        System.out.println(switchCaseBuilder(MyMethod.getString()));
//        System.out.println(sumOfNumber(MyMethod.getInt()));

//        System.out.println(startsWith("Ala ma kota","Ala"));
//        System.out.println(startsWith("Ala ma kota","Alaq"));
//        System.out.println(startsWithSubString("Ala ma kota","Ala"));
//        System.out.println(startsWithSubString("Ala ma kota","Alaq"));
//        System.out.println(startsWithCharArray("Ala ma kota","Ala"));
//        System.out.println(startsWithCharArray("Ala ma kota","Alaq"));

        String[] strings = split2("Ala ma kota");
        for (int i = 0; i < strings.length; i++)
        {
            System.out.println(strings[i]);
        }
    }

    public static long factorial(int length) {
        long factorial = 1;
        if (length > 0)
        {
            for (int i = 2; i < length; i++)
            {
                factorial *= i;
            }

        } else if (length < 0)
        {
            factorial = -1;
        }
        return factorial;
    }

    public static long factorialRecursion(long number) {
        long result = 1;
        if (number < 0)
        {
            result = -1;
        }
        if (number > 0)
        {
            result = factorialRecursion(number - 1) * number;
        }
        return result;
    }

    public static int fibonac(int number) {
        int valueLeft = 0;
        int valueRigth = 1;
        int temp = 0;
        for (int i = 0; i < number; i++)
        {
            temp = valueLeft;
            valueLeft = valueRigth;
            valueRigth += temp;
        }
        return valueLeft;
    }

    public static int fibonacRecursion(int number) {
        int value = 0;
        if (number < 0)
        {
            value = -1;
        }
        if (number == 1)
        {
            value = 1;
        }
        if (number > 1)
        {
            value = fibonacRecursion(number - 1) + fibonacRecursion(number - 2);
        }
        return value;
    }

    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] > 96 && charArray[i] < 123)
            {
                charArray[i] -= 32;
            } else if (charArray[i] > 64 && charArray[i] < 91)
            {
                charArray[i] += 32;
            }
        }
        return String.valueOf(charArray);

    }

    public static String switchCaseBuilder(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++)
        {
            char tmp = message.charAt(i);
            if (tmp > 96 && tmp < 123)
            {
                stringBuilder.append((char) (tmp - 32));
            } else if (tmp > 64 && tmp < 91)
            {
                stringBuilder.append((char) (tmp + 32));
            } else
            {
                stringBuilder.append(tmp);
            }

        }
        return stringBuilder.toString();
    }

    public static boolean startsWith(String message, String expression) {
        return message.startsWith(expression);
    }

    /*
    *Can throw exception
    */
    public static boolean startsWithSubString(String message, String expression) {
        if (message.length() < expression.length())
        {
            return false;
        }
        return message.substring(0, expression.length()).equals(expression);
    }

    public static boolean startsWithCharArray(String message, String expression) {
        char[] messageArray = message.toCharArray();
        char[] expresionArray = expression.toCharArray();
        boolean flag = true;
        for (int i = 0; i < expresionArray.length; i++)
        {
            if (messageArray[i] != expresionArray[i])
            {
                flag = false;
            }
        }
        return flag;
    }

    public static int sumOfNumber(int number) {
        int sum = 0;
        while (number != 0)
        {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static String[] split1(String message) {
        return message.split(" ");
    }

    public static String[] split2(String message) {
        String[] stringArray = new String[100];
        int tmp = 0;
        int i = 0;
        boolean flag = true;
        while (flag)
        {
            int indexOfSpace = message.indexOf(' ', tmp);
            String substring;
            if (indexOfSpace == -1)
            {
                substring = message.substring(tmp);
            } else
            {
                substring = message.substring(tmp, indexOfSpace);
            }
            tmp = indexOfSpace + 1;
            stringArray[i] = substring;
            i++;
            if (indexOfSpace == -1)
            {
                flag = false;
            }
        }
        stringArray=rewriteString(stringArray,i);
        return stringArray;
    }

    public static String[] rewriteString(String[] array, int size) {
        String[] tmpArray = new String[size];
        for (int i = 0; i < size; i++)
        {
            tmpArray[i]=array[i];
        }
        return tmpArray;
    }
}


