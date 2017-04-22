package pl.sda.sdaPostman;

import org.codehaus.jackson.map.ObjectMapper;
import pl.sda.Utils.HttpUtils;
import pl.sda.message.CreateUserRequest;
import pl.sda.message.CreateUserResponse;
import pl.sda.message.GetUserResponse;

import java.io.IOException;
import java.util.*;

/**
 * Created by Miki on 06.03.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        boolean flag = true;

        List<String> userIdList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Integer choice = 1;
        while (flag) {

            System.out.println("1.Add user");
            System.out.println("2.Print List");
            System.out.println("3.Print data");

            String choiceRaw = scanner.nextLine();
            choice = Integer.parseInt(choiceRaw);


            switch (choice) {
                case 1: {
                    CreateUserRequest createUserRequest = new CreateUserRequest();

                    System.out.println("Podaj imie: ");
                    createUserRequest.setName(scanner.nextLine());
                    System.out.println("Podaj login: ");
                    createUserRequest.setLogin(scanner.nextLine());
                    System.out.println("Podaj maila: ");
                    createUserRequest.setMail(scanner.nextLine());
                    ObjectMapper mapper = new ObjectMapper();
                    String request = mapper.writeValueAsString(createUserRequest);

                    String createUserResponse = Sender.createUser("http://localhost:8081/sda-json/json", request);

                    CreateUserResponse response = mapper.readValue(createUserResponse, CreateUserResponse.class);
                    userIdList.add(response.getId());
                    break;
                }
                case 2: {
                    System.out.println(userIdList.toString());
                    break;
                }
                case 3: {
                    List<String> getUserResponseList = new ArrayList<>();
                    for(String id: userIdList)
                    {
                        String response =  Sender.getUser("http://localhost:8081/sda-json/json", id);
                        getUserResponseList.add(response);
                    }
                    System.out.println(getUserResponseList.toString());
                    break;
                }

                default: {
                    flag = false;
                }

            }
        }

        System.out.println(" ");
    }
}




