package com.pan.ormJpa;

import com.pan.ormJpa.Repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepoTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testingGetUser() {
        Assertions.assertEquals("Marc", userRepository.findById(6).get().getName());
    }
}


