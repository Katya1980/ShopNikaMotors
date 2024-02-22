package by.teachmeslills.nikamotors.repository;

import by.teachmeslills.nikamotors.entity.User;

import java.util.ArrayList;
import java.util.Collection;

public interface ShopRepository {

    public void add (User user);
    public void deleteByld(Long userId);
    public Collection<User> allUsers();

}
