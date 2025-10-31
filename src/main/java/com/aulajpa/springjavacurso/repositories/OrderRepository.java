package com.aulajpa.springjavacurso.repositories;

import com.aulajpa.springjavacurso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
