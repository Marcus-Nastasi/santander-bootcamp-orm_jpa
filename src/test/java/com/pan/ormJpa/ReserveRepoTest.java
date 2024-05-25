package com.pan.ormJpa;

import com.pan.ormJpa.Repository.ReserveRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReserveRepoTest {

    @Autowired
    private ReserveRepository reserveRepository;

    @Test
    void testingReserveRepo() {

    }
}


