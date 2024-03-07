package by.teachmeslills.nikamotors.mapper;

import by.teachmeslills.nikamotors.dto.user.UserRequest;
import by.teachmeslills.nikamotors.dto.user.UserResponse;
import by.teachmeslills.nikamotors.entity.User;

public class UserMapper {

    public User toEntity(UserRequest userRequest) {
        User user = new User();
        user.setId(userRequest.getId());
        user.setName(userRequest.getName());
        user.setSurname(userRequest.getSurname());
        user.setLogin(userRequest.getLogin());
        user.setPassword(userRequest.getPassword());
        return user;

    }

    public UserResponse toResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setName(user.getName());
        userResponse.setSurname(user.getSurname());
        userResponse.setLogin(user.getLogin());
        userResponse.setPassword(user.getPassword());
        return userResponse;
    }

}
