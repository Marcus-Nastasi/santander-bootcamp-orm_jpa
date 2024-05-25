package com.pan.ormJpa;

import com.pan.ormJpa.Repository.DestinyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DestinyRepoTest {

    @Autowired
    private DestinyRepository destinyRepository;

    @Test
    void testingDestinyRepo() {
        assertEquals("Amazonas", destinyRepository.findById(1).get().getName());
        assertEquals("Beautiful beach city in Brazil.", destinyRepository.findById(4).get().getDescription());
        assertEquals("São Paulo", destinyRepository.findById(5).get().getName());
    }
}


