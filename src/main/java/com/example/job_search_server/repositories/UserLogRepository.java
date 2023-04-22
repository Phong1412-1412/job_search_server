package com.example.job_search_server.repositories;

import com.example.job_search_server.entities.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLogRepository extends JpaRepository<UserLog, String> {
}
