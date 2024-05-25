package com.pan.ormJpa;

import com.pan.ormJpa.Repository.DestinyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DestinyRepoTest {

    @Autowired
    private DestinyRepository destinyRepository;

    @Test
    void testingDestinyRepo() {

    }
}


