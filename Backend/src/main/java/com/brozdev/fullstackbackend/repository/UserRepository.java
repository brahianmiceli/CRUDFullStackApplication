package com.brozdev.fullstackbackend.repository;

import com.brozdev.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}
