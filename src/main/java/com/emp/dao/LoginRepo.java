package com.emp.dao;

import java.util.Optional;

import com.emp.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login, Long> {
    Optional<Login> findFirstByUserNameAndTokenAndStatusOrderByCreatedDateDesc(String userName, String token, String status);
}
