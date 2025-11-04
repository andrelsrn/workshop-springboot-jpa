package com.aulajpa.springjavacurso.repositories;

import com.aulajpa.springjavacurso.entities.Category;
import com.aulajpa.springjavacurso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
