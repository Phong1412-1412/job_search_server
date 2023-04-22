package com.example.job_search_server.iservice;

import com.example.job_search_server.entities.UserLog;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface IUserLog {
    Optional<List<UserLog>> getAllUserLog();
    Optional<List<UserLog>> getUserLogByLastLogin(Date date);
    Optional<List<UserLog>> getUserLogByLastJobApply(Date date);
}
