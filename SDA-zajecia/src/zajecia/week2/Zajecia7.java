package zajecia.week2;

import zajecia.MyMethod;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Miki on 08.02.2017.
 */
public class Zajecia7 {
    public static void main(String[] args) {
//        String message = "abcd1234";
//        int[] seed = randomSeedForMessage(message);
//        MyMethod.displayArray(seed);
//        System.out.println(randomSeedCezarCode(message,seed));
//        System.out.println(decodeRandomSeedCezarCode(randomSeedCezarCode(message,seed),seed));
//        System.out.println(decodeProgresiveCezarCode(progresiveCezarCode(message)));

//        String message = (randomLowerCaseCorrect(10000));
//        arrayPrinter2(smallLetterCouter(message));

        String message = "Ala_ma_kota";
        System.out.println(changeUnderline(message));
        System.out.println(changeDirectionOfString(message));
    }

    public static String progresiveCezarCode(String message) {
        char[] charArray = message.toCharArray();
        char[] codedArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++)
        {
            codedArray[i] = charArray[i] += i;
        }
        return String.valueOf(charArray);
    }

    public static String decodeProgresiveCezarCode(String message) {
        char[] charArray = message.toCharArray();
        char[] codedArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++)
        {
            codedArray[i] = charArray[i] -= i;
        }
        return String.valueOf(charArray);
    }

    public static String randomSeedCezarCode(String message, int[] seed) {
        char[] charArray = message.toCharArray();
        char[] codedArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++)
        {
            codedArray[i] = charArray[i] += seed[i];
        }
        return String.valueOf(charArray);
    }

    public static String decodeRandomSeedCezarCode(String message, int[] seed) {
        char[] charArray = message.toCharArray();
        char[] codedArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++)
        {
            codedArray[i] = charArray[i] -= seed[i];
        }
        return String.valueOf(charArray);
    }

    public static int[] randomSeedForMessage(String message) {
        int length = message.length();
        int[] seed = new int[length];
        for (int i = 0; i < length; i++)
        {
            seed[i] = MyMethod.randomInt(100);
        }
        return seed;
    }

    public static int[] smallLetterCouter(String message) {
        int[] arrayCounter = new int[26];
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] >= 97 && charArray[i] <= 122)
            {
                arrayCounter[charArray[i] - 97]++;
            }
        }
        return arrayCounter;
    }

    public static void charArrayPrinter(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != 0)
            {
                for (int j = 0; j < array[i]; j++)
                {
                    System.out.print((char) (i + 97));
                }
            }
        }
    }

    public static String randomLowerCase(int size) {
        char[] charArray = new char[size];
        for (int i = 0; i < size; i++)
        {
            charArray[i] = (char) (MyMethod.randomInt(25) + 97);
        }
        String out = String.valueOf(charArray);
        return out;
    }

    public static String randomLowerCaseReboot(int size) {
        Random random = new Random();
        String tmpMessage = "";
        for (int i = 0; i < size; i++)
        {
            int generatedValue = random.nextInt(26) + 97;
            String generatedValueAsString = String.valueOf((char) (generatedValue));
            tmpMessage += generatedValueAsString;
        }
        return tmpMessage;
    }

    public static String randomLowerCaseCorrect(int size) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++)
        {
            int generatedValue = random.nextInt(26) + 97;
            stringBuilder.append((char) generatedValue);
        }
        return stringBuilder.toString();
    }

    public static void arrayPrinter2(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
//            if (array[i] != 0)
            {
                System.out.print((char) (i + 97) + ":" + array[i] + " ");
                for (int j = 0; j < array[i] / 10; j++)
                {
                    System.out.print("|");
                }
                System.out.println();
            }
        }
    }

    public static String changeUnderline(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] == 95)
            {
                charArray[i] = (char) 32;
            }
        }
        return String.valueOf(charArray);
    }

    public static String changeDirectionOfString (String message){
        char[] charArray = message.toCharArray();
        for (int i = 0; i < (charArray.length/2); i++)
        {
            char temp = charArray[i];
            charArray[i]=charArray[charArray.length-i-1];
            charArray[charArray.length-i-1]=temp;
        }
        return String.valueOf(charArray);
    }

    public static int sumFromString(String message) {
        int sum = 0;
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                sum += charArray[i] - 48;
            }
        }
        return sum;
    }

    public static boolean isPalindra(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

}





