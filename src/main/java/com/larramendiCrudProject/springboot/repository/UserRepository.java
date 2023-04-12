package com.larramendiCrudProject.springboot.repository;

import com.larramendiCrudProject.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
