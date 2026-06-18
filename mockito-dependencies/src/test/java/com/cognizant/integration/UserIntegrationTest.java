package com.cognizant.integration;

import com.cognizant.entity.User;
import com.cognizant.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserRepository repo;

    @Test
    void testFlow() {
        repo.save(new User(1L, "Deepika"));

        User response = restTemplate.getForObject(
                "http://localhost:" + port + "/users/1",
                User.class
        );

        assertEquals("Deepika", response.getName());
    }
}