package by.teachmeslills.nikamotors.repository;

import by.teachmeslills.nikamotors.entity.User;

import java.util.Collection;

public interface UserRepository {

    public User add (User user);
    public void deleteByld(Long userId);
    public Collection<User> allUsers();

}
