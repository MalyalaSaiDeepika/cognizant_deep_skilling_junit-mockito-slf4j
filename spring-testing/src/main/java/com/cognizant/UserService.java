package com.cognizant;

import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class UserService {

    private final UserRepository userRepository;

    // ✅ ADD THIS CONSTRUCTOR (FIX)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User not found"));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}