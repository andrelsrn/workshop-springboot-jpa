package com.aulajpa.springjavacurso.repositories;

import com.aulajpa.springjavacurso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
