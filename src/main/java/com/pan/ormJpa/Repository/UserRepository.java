package com.pan.ormJpa.Repository;

import com.pan.ormJpa.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}


