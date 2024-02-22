package by.teachmeslills.nikamotors;

import by.teachmeslills.nikamotors.entity.User;
import by.teachmeslills.nikamotors.repository.FileRepository;

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
        user2.setId(1L);
        user2.setName("Петя");
        user2.setSurname("Петров");
        user2.setLogin("Petr");
        user2.setPassword("12345");

        User user3 = new User();
        user3.setId(1L);
        user3.setName("Иван");
        user3.setSurname("Иванов");
        user3.setLogin("Ivan");
        user3.setPassword("123456");

        fileRepository.add(user1);
        fileRepository.add(user2);
        fileRepository.add(user3);

        System.out.println("Все пользователи:  ");
        for (User user: fileRepository.allUsers()){
            System.out.println(user);
        }

fileRepository.deleteByld(4L);
        System.out.println("Обновленный список пользователей:  ");
        for (User user: fileRepository.allUsers()){
            System.out.println(user);
        }


    }
}