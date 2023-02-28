package com.springbootworkshop.teste.repositories;

import com.springbootworkshop.teste.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
