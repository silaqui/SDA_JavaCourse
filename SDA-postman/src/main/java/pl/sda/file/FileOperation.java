package pl.sda.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        String message = "Hello World";
        File file = new File("C:\\Users\\Miki\\Desktop\\test.txt");


//        exampleWriteToFile("Hello World" , file);
//        exampleReaderFromFile(file);
//        nameReaderWithSpace(file);
//        nameReaderNamyLines(file);

        List<User> users = userReaderFromFile(file);
        for (User user : users) {
            System.out.println(user.toString());
        }

        User user1 = new User("Ziomek", "Poziomek", 123);
        addUserToFile(user1, file);

        System.out.println(" ");

        users = userReaderFromFile(file);
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    private static void exampleReaderFromFile(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            String s = scanner.nextLine();
            System.out.println(s);
        }
    }

    private static void nameReaderWithSpace(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            String s = scanner.nextLine();
            String[] nameList = s.split(" ");
            for (String name : nameList) {
                System.out.println(name);
            }
        }
    }

    private static void nameReaderNamyLines(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                String[] nameList = s.split(" ");
                for (String name : nameList) {
                    System.out.println(name);
                }
            }
        }
    }

    private static void exampleWriteToFile(String message, File file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(message);
        }
    }

    private static List<User> userReaderFromFile(File file) throws FileNotFoundException {
        List<User> users = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                String[] nameList = s.split(" ");
                User newUser = new User();
                newUser.setFirstName(nameList[0]);
                newUser.setLastName(nameList[1]);
                newUser.setAge(new Integer(nameList[2]));
                users.add(newUser);
            }
        }
        return users;
    }

    public static void addUserToFile(User user, File file) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(user.toString());
        }
    }


}