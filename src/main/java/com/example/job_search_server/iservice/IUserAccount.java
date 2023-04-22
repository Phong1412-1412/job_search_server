package com.example.job_search_server.iservice;

import com.example.job_search_server.entities.UserAccount;
import com.example.job_search_server.entities.UserType;

import java.util.List;
import java.util.Optional;

public interface IUserAccount {
    Optional<List<UserAccount>> getAllUserAccount();
    Optional<UserAccount> getUserByName(String name);
    Optional<UserAccount> getUserByID(String id);
    UserAccount updateUserByID(String id);
    void deleteUserByID(String id);
    List<UserType> findUserByType(UserRole userRole);

}
