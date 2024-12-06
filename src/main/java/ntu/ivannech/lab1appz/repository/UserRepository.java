package ntu.ivannech.lab1appz.repository;

import ntu.ivannech.lab1appz.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public User getDefaultUser() {
        return new User("name", "surname");
    }
}
