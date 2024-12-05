package com.proselyte.springbootdemo.repository;

import com.proselyte.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
