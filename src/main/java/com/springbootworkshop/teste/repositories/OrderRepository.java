package com.springbootworkshop.teste.repositories;

import com.springbootworkshop.teste.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
