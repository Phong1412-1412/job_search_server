package com.example.job_search_server.repositories;

import com.example.job_search_server.entities.UserAccount;
import com.example.job_search_server.entities.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserTypeRepository extends JpaRepository<UserType, Integer> {
}
