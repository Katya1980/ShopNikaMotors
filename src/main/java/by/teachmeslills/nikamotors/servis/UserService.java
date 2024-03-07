package by.teachmeslills.nikamotors.servis;

import by.teachmeslills.nikamotors.dto.user.UserRequest;
import by.teachmeslills.nikamotors.dto.user.UserResponse;
import by.teachmeslills.nikamotors.entity.User;
import by.teachmeslills.nikamotors.mapper.UserMapper;
import by.teachmeslills.nikamotors.repository.FileRepository;
import by.teachmeslills.nikamotors.repository.UserRepository;

import java.util.*;

public class UserService {

    public UserResponse add(UserRequest userRequest) {
        UserRepository userRepository = new FileRepository();
        UserMapper userMapper = new UserMapper();
        User user = userMapper.toEntity(userRequest);
        user = userRepository.add(user);
        UserResponse userResponse = userMapper.toResponse(user);
        return userResponse;

    }

    public List<UserResponse> allUsers() {
        UserRepository userRepository = new FileRepository();
        UserMapper userMapper = new UserMapper();
        List<UserResponse> userResponses = new ArrayList<>();
        Collection<User> users = userRepository.allUsers();
        for (User user : users) {
            UserResponse userResponse = userMapper.toResponse(user);
            userResponses.add(userResponse);
        }
        return userResponses;
    }

    public UserResponse authentication(String login,String password) {
        FileRepository fileRepository = new FileRepository();
        List<User> users = (List<User>) fileRepository.allUsers();
        User user = users.stream().filter(user1 -> Objects.equals(user1.getLogin(), (login))).findFirst().orElseThrow(() -> new RuntimeException("Пользователь с логином" + login + "существует"));
        if (user.getPassword().equals(password)) {
            throw new RuntimeException("Не верно введен пароль");

        }
        return (UserResponse) users;
    }


}
