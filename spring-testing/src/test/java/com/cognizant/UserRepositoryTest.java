package com.cognizant;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    @Test
    void testFindByName() {
        UserRepository repo = mock(UserRepository.class);

        when(repo.findByName("Deepika"))
                .thenReturn(List.of(new User()));

        List<User> result = repo.findByName("Deepika");

        assertFalse(result.isEmpty());
    }
}