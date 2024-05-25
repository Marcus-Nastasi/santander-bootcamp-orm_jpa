package com.pan.ormJpa.Repository;

import com.pan.ormJpa.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User, Integer> {
}


