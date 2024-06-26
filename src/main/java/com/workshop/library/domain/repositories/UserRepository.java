package com.workshop.library.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.library.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
