package com.cognizant.service;

import com.cognizant.entity.User;
import com.cognizant.repository.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testGetUser() {
        UserRepository repo = mock(UserRepository.class);

        when(repo.findById(1L))
                .thenReturn(Optional.of(new User(1L, "Deepika")));

        UserService service = new UserService(repo);

        User user = service.getUserById(1L);

        assertNotNull(user);
        assertEquals("Deepika", user.getName());
    }
}