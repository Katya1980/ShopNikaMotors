package by.teachmeslills.nikamotors.dto.user;

import javax.management.relation.Role;
import java.util.Objects;

public class UserRequest {
    private long id;

    private String name;
    private String surname;
    private String password;
    private String login;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRequest that)) return false;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(password, that.password) && Objects.equals(login, that.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, password, login);
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
