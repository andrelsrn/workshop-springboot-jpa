package com.aulajpa.springjavacurso.repositories;

import com.aulajpa.springjavacurso.entities.OrderItem;
import com.aulajpa.springjavacurso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
