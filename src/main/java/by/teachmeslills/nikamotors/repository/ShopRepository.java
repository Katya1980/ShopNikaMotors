package by.teachmeslills.nikamotors.repository;

import by.teachmeslills.nikamotors.entity.User;

import java.util.Collection;
import java.util.List;

public interface ShopRepository {

    public void add (User user) ;


  public void deleteById(Long userId);

    public Collection<User> allUsers();

}
