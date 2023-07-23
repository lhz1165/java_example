package six;

import java.util.Objects;

public class User {

    String username;

    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        User u1 = this;
        User u2 = (User) o;
        if (u1.username == u2.username && u1.password == u2.password) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
