package com.aulajpa.springjavacurso.repositories;

import com.aulajpa.springjavacurso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
