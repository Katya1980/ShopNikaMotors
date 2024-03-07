package by.teachmeslills.nikamotors.repository;

import by.teachmeslills.nikamotors.entity.User;

import java.io.*;
import java.util.*;

public class FileRepository implements UserRepository {

    private final String filePath = "E:\\Козловская Е. В\\ShopNikaMotors\\users";
    private List<User> users;

    public FileRepository() {

        users = deserializable();
    }


    @Override
    public User add(User user) {
        users.add(user);
        serializable();
        return user;

    }

    @Override
    public void deleteByld(Long userId) {
        users.removeIf(user -> user.getId() == userId);
        serializable();


    }

    @Override
    public Collection<User> allUsers() {

        return users;
    }

    public void serializable() {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filePath))) {
            os.writeObject(users);
            System.out.println("Серилазация упешна. Количесво пользоватлей:" + users.size());
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации пользователей" + e.getMessage());
            throw new RuntimeException(e);


        }

    }

    public List<User> deserializable() {
        File file = new File(filePath);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(filePath))) {
            users = (List<User>) is.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при десериализации пользователей" + e.getMessage());

        }
        return users;
    }

}
