package com.pan.ormJpa;

import com.pan.ormJpa.Repository.ReserveRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ReserveRepoTest {

    @Autowired
    private ReserveRepository reserveRepository;

    @Test
    void testingReserveRepo() {
        assertEquals(5, reserveRepository.findById(3).get().getId_destiny());
        assertEquals(1, reserveRepository.findById(2).get().getId_user());
        assertEquals("confirmed", reserveRepository.findById(4).get().getStatus());
        assertEquals(LocalDate.of(2024, 6, 10), reserveRepository.findById(1).get().getReserve_date());
    }
}


