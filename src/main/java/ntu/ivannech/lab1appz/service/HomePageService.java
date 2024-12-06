package ntu.ivannech.lab1appz.service;

import lombok.AllArgsConstructor;
import ntu.ivannech.lab1appz.model.User;
import ntu.ivannech.lab1appz.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class HomePageService {

    public static final String GREETINGS_FORMAT = "hi. im just say bruh to you, %s %s,\nif you re interested in time and all that: %s";
    private UserRepository userRepository;

    public String getHelloString() {
        User user = userRepository.getDefaultUser();
        return String.format(GREETINGS_FORMAT, user.getName(), user.getSurname(), LocalDateTime.now());
    }
}
