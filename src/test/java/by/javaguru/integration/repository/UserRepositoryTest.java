package by.javaguru.integration.repository;

import by.javagury.spring.database.repository.UserRepository;
import by.javaguru.annotation.IT;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@IT
@RequiredArgsConstructor
public class UserRepositoryTest {
    private static final Long USER_ID = 2L;
    private final UserRepository userRepository;

    @Test
    public void findById() {
        var user = userRepository.findById(USER_ID);
        assertNotNull(user);
    }
}