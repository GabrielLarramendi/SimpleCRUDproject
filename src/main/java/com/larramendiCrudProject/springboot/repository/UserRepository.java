package com.larramendiCrudProject.springboot.repository;

import com.larramendiCrudProject.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> getByEmail(String email); //Query method to retrieve a user email

}
