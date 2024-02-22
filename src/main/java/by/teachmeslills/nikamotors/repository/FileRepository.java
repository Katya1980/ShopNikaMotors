package by.teachmeslills.nikamotors.repository;

import by.teachmeslills.nikamotors.entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.OptionalLong;

public class FileRepository implements ShopRepository {

    private final String filePath = "E:\\Козловская Е. В\\ShopNikaMotors\\users";
    private List<User> users;

    public FileRepository() {

        users = deserializable();

    }

    @Override
    public void add(User user) {
        users.add(user);
        serializable();
    }

    @Override
    public void deleteByld(Long userId) {
        users.removeIf(user -> OptionalLong.of(user.getId()).equals(userId));
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
            System.err.println("Ошибка при сериализации пользователей" + e.getMessage());

        }

    }

    public List<User> deserializable() {
        File file = new File(filePath);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(file))) {
            return (List<User>) is.readObject();


        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации пользователей" + e.getMessage());


        }
        return new ArrayList<>();
    }

}
