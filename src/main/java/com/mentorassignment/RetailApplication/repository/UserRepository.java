package com.mentorassignment.RetailApplication.repository;

import com.mentorassignment.RetailApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

     User findByEmail(@Param("email") String email);

}
