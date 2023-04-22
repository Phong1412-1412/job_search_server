package com.example.job_search_server.repositories;

import com.example.job_search_server.entities.UserAccount;
import com.example.job_search_server.iservice.UserRole;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
    Optional<UserAccount> findAllByUserType(UserRole userRole);
}
