package by.teachmeslills.nikamotors;

import by.teachmeslills.nikamotors.entity.User;
import by.teachmeslills.nikamotors.repository.FileRepository;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FileRepository fileRepository = new FileRepository();

        User user1 = new User();
        user1.setId(1L);
        user1.setName("Катя");
        user1.setSurname("Козловская");
        user1.setLogin("Katya");
        user1.setPassword("1234");

        User user2 = new User();
        user1.setId(2L);
        user1.setName("Иван");
        user1.setSurname("Иванов");
        user1.setLogin("Ivan");
        user1.setPassword("12345");

         fileRepository.add(user1);
         fileRepository.add(user2);

        System.out.println("Все пользователи:");
        for (User user: fileRepository.allUsers()){
            System.out.println(user);
        }
         fileRepository.deleteById(11L);
        System.out.println("Обновленный список пользователей:");
        for (User user: fileRepository.allUsers()){
            System.out.println(user);
        }


    }
}